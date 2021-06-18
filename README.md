#JPA

## <s>PagingAndSortingRepository<T, ID></s>
## <s>QueryByExampleExecutor<T`></s>
    example 구문을 사용하기위하여.

### JpaRepository
    PagindAndSortingRepository ,QueryByExampleExecutor 을 상속
    
### findAll()
    조건 없이 테이블의 전체 데이터를 가져옴.
    실제 서비스에서는 성능적인 이슈가 있어서 잘 사용하지 않음.

### findAll(Sort sort)
    정렬을 통해서 데이터를 가져옴

### findAllById(Iterable<ID`> ids)
    아이디 값을 리스트로 받아서 인 구문으로 조회 해서 여러가지 엔티티를 조회.

### saveAll(Iterable<S`> entities)
    리스트 형식으로 받아서 저장.

### flush()
    영속성에 관련.
    
### deleteInBatch(Iterable<T`> entities);
    리스트형식으로 받아서 삭제.

### getOne(ID id)
    아이디를 이용하여 하나의 값을 가져옴.


