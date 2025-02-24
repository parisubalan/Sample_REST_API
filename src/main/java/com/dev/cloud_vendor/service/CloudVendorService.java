package com.dev.cloud_vendor.service;

import com.dev.cloud_vendor.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public CloudVendor getCloudVendorById(String vendorID);
    public List<CloudVendor> getAllCloudVendors();

}
