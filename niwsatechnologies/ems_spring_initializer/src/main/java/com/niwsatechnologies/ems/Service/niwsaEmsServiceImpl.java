package com.niwsatechnologies.ems.Service;

import com.niwsatechnologies.ems.Model.niwsaEms;
import com.niwsatechnologies.ems.Repository.niwsaEmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class niwsaEmsServiceImpl implements niwsaEmsService{
@Autowired
private niwsaEmsRepository niwsaEmsRepository;
    @Override
    public niwsaEms saveUser(niwsaEms User){
        return niwsaEmsRepository.save(User);

    }
    @Override
    public List<niwsaEms> fetchniwsaEmsUsersList() {
        return niwsaEmsRepository.findAll();
    }

    @Override
    public Optional<niwsaEms> fetchniwsaEmsUsersId(Long serialID) {
        return niwsaEmsRepository.findById(serialID);
    }

    @Override
    public void deleteniwsaEmsUsersbyId(Long serialID) {
        niwsaEmsRepository.deleteById(serialID);

    }

    @Override
    public void deleteniwsaEmsUsers() {
        niwsaEmsRepository.deleteAll();
    }

    @Override
    public niwsaEms getniwsaEmsUsersbyemail(String email) {
        return niwsaEmsRepository.findByempEmail(email);
    }

    @Override
    public niwsaEms updateUser(Long serialIDFromInsomnia, niwsaEms niwsaEmsFromInsomnia) {
niwsaEms niwsaEmsDB = niwsaEmsRepository.findById(serialIDFromInsomnia).get();

        if(Objects.nonNull(niwsaEmsFromInsomnia.getEmpEmail()) &&
                !"".equalsIgnoreCase(niwsaEmsFromInsomnia.getEmpEmail())){
            niwsaEmsDB.setEmpEmail(niwsaEmsFromInsomnia.getEmpEmail());
        }
        if(Objects.nonNull(niwsaEmsFromInsomnia.getEmpFirstName()) &&
                !"".equalsIgnoreCase(niwsaEmsFromInsomnia.getEmpFirstName())){
            niwsaEmsDB.setEmpFirstName(niwsaEmsFromInsomnia.getEmpFirstName());
        }
        if(Objects.nonNull(niwsaEmsFromInsomnia.getEmpLastName()) &&
                !"".equalsIgnoreCase(niwsaEmsFromInsomnia.getEmpLastName())){
            niwsaEmsDB.setEmpLastName(niwsaEmsFromInsomnia.getEmpLastName());
        }
        if(Objects.nonNull(niwsaEmsFromInsomnia.getEmpID()) &&
                !"".equalsIgnoreCase(niwsaEmsFromInsomnia.getEmpID())){
            niwsaEmsDB.setEmpID(niwsaEmsFromInsomnia.getEmpID());
        }
        return niwsaEmsRepository.save(niwsaEmsDB);
    }
}
