package repository;

import entity.DanhGiaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhGiaRepository extends PagingAndSortingRepository<DanhGiaEntity, Long> {
    Page<DanhGiaEntity> findAllByNgoiNha(String tenNha);
}
