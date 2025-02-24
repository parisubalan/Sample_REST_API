package com.dev.cloud_vendor.repository;

import com.dev.cloud_vendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepo extends JpaRepository<CloudVendor,String> {
}
