package com.example.h2test;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ResponseFormService {
    @Autowired
    private ResponseFormRepository responseFormRepository;

    public void insertResponse(ResponseForm responseForm){
        this.responseFormRepository.save(responseForm);
    }

    public List<ResponseForm> getAllResponeses(){
        return responseFormRepository.findAll();
    }

    public List<ResponseForm> getResponsesByMusic(long id){
        return responseFormRepository.findByMusicId(id);
    }
}
