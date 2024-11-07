package edu.icet.service;
import java.util.List;
import edu.icet.dto.Package;

public interface PackageService {
    List<Package> getAll();
    void addPackage(Package packageA);
    Package searchPackageById(Integer id);
    void deletePackageById(Integer id);
    void updatePackageById(Package packageA);
}
