package com.pradeep.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
