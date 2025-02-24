package com.dev.cloud_vendor.controller;

import com.dev.cloud_vendor.model.CloudVendor;
import com.dev.cloud_vendor.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloud_vendor")
public class CloudVendorController {

    @Autowired
    CloudVendorService cloudVendorService;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorById(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendorById(vendorId);
    }

    @PostMapping("/create")
    public String createCloudVendor(@RequestBody CloudVendor vendor) {
        return cloudVendorService.createCloudVendor(vendor);
    }

    @PutMapping("/update")
    public String updateCloudVendor(@RequestBody CloudVendor vendor) {
        return cloudVendorService.updateCloudVendor(vendor);
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendorById(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.deleteCloudVendor(vendorId);
    }

    @GetMapping("/all_vendors")
    public List<CloudVendor> getAllVendors() {
        return cloudVendorService.getAllCloudVendors();
    }
}
