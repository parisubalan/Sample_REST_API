package com.dev.cloud_vendor.service.impl;

import com.dev.cloud_vendor.model.CloudVendor;
import com.dev.cloud_vendor.repository.CloudVendorRepo;
import com.dev.cloud_vendor.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    @Autowired
    CloudVendorRepo cloudVendorRepo;

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Cloud Vendor Saved Successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "Cloud Vendor Update Successfully";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepo.deleteById(vendorId);
        return vendorId + " was deleted successfully";
    }

    @Override
    public CloudVendor getCloudVendorById(String vendorID) {
        CloudVendor vendor = null;
        if (cloudVendorRepo.findById(vendorID).isPresent())
            vendor = cloudVendorRepo.findById(vendorID).get();
        return vendor;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepo.findAll();
    }
}
