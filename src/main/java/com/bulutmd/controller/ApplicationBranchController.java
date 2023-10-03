package com.bulutmd.controller;

import com.bulutmd.entity.BranchApplicationEntity;
import com.bulutmd.mapper.BranchApplicationMapper;
import com.bulutmd.model.ApplicationBranchDTO;
import com.bulutmd.service.ApplicationBranchService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("applicationBranches")
public class ApplicationBranchController {

   private final ApplicationBranchService applicationBranchService;


   @GetMapping("{id}")
   public ApplicationBranchDTO findById(@PathVariable("id") long id){
       return applicationBranchService.getApplicationBranchById(id);

   }

    @GetMapping
    public String findAll(Model model){
        List<ApplicationBranchDTO> allApplicationBranch = applicationBranchService.getAllApplicationBranch();
        model.addAttribute("branchApplication", allApplicationBranch);
        return "application-branches";

    }

    @PostMapping
    public String save(@ModelAttribute("applicationBranch") ApplicationBranchDTO applicationBranchDTO){
        ApplicationBranchDTO applicationBranch = applicationBranchService.createApplicationBranch(applicationBranchDTO);
        return "redirect:/applicationBranches";

    }

    @PostMapping("update")
    public String update(@ModelAttribute("applicationBranch") ApplicationBranchDTO applicationBranchDTO){
        applicationBranchService.updateApplicationBranch(applicationBranchDTO);
        return "redirect:/applicationBranches";

    }

    @GetMapping("newApplicationBranch")
    public String addNewBranchApplication(Model model){
        ApplicationBranchDTO applicationBranchDTO = new ApplicationBranchDTO();
        model.addAttribute("applicationBranch", applicationBranchDTO);
        return "application-branch-form";

    }

    @GetMapping("delete")
    public String deleteBranchApplication(@RequestParam("id") Long id){

        applicationBranchService.deleteApplicationBranchById(id);
        return "redirect:/applicationBranches";

    }

    @GetMapping("showFormForUpdate")
    public String updateBranchApplication(@RequestParam("id") Long id, Model model){

        ApplicationBranchDTO applicationBranch = applicationBranchService.getApplicationBranchById(id);
        model.addAttribute("applicationBranch",applicationBranch);

        return "application-branch-update-form";
    }

}