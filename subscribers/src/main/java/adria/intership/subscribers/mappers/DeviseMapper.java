package adria.intership.subscribers.mappers;

import adria.intership.subscribers.dto.DeviseDto;
import adria.intership.subscribers.entities.Devise;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeviseMapper {

//    private AdminMapper adminMapper;
//    private PaysMapper paysMapper;

    public DeviseDto deviseToDto(Devise devise) {
        DeviseDto deviseDto = new DeviseDto();
        if(devise!=null){
            BeanUtils.copyProperties(devise, deviseDto);

//            List<PaysDto> paysDtoList = devise.getPays().stream()
//                    .map(pays -> paysMapper.paysToDto(pays))
//                    .collect(Collectors.toList());
//            deviseDto.setPays(paysDtoList);

//            if(devise.getAdmin()!=null)
//                deviseDto.setAdminDto(adminMapper.adminToDto(devise.getAdmin()));
//            else
                deviseDto.setAdminDto(null);
            return deviseDto;
        }
        return null;
    }

    public Devise deviseDtoToDevise(DeviseDto deviseDto) {
        Devise devise = new Devise();
        if(deviseDto!=null){
            BeanUtils.copyProperties(deviseDto, devise);

//            List<Pays> paysList = deviseDto.getPays().stream()
//                    .map(paysDto -> paysMapper.paysDtoToPays(paysDto))
//                    .collect(Collectors.toList());
//            devise.setPays(paysList);

//            if(deviseDto.getAdminDto()!=null)
//                devise.setAdmin(adminMapper.adminDtoToAdmin(deviseDto.getAdminDto()));
//            else
                devise.setAdmin(null);
            return devise;
        }
        return null;

    }
}
