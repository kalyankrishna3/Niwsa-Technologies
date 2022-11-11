package com.niwsatechnologies.ems.Service;

import com.niwsatechnologies.ems.Model.niwsaEms;

import java.util.List;
import java.util.Optional;

public interface niwsaEmsService {

    public niwsaEms saveUser(niwsaEms User);

    public List<niwsaEms> fetchniwsaEmsUsersList();
    public Optional<niwsaEms> fetchniwsaEmsUsersId(Long serialID);

    public void deleteniwsaEmsUsersbyId(Long serialID);
    public void deleteniwsaEmsUsers();

    public niwsaEms getniwsaEmsUsersbyemail(String email);

    public niwsaEms updateUser(Long serialID, niwsaEms niwsaEms);
}
