# @GeneratedValue(strategy = GenerationType.AUTO)

[return to README.md](/README.md)

```
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
```

  @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  // @GeneratedValue(strategy = GenerationType.SEQUENCE)
  // @GeneratedValue(strategy = GenerationType.TABLE)
  // @GeneratedValue(strategy = GenerationType.UUID)
  @GeneratedValue(generator = "hibernate_sequence")
  @GenericGenerator(name = "hibernate_sequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
      @Parameter(name = "sequence_name", value = "hibernate_sequence"), @Parameter(name = "initial_value", value = "1"),
      @Parameter(name = "increment_size", value = "1") })
  private Long id;




springboot-data-jpa-mysql-generationtype-auto.md
springboot-data-jpa-mysql-generationtype-identity.md
springboot-data-jpa-mysql-generationtype-sequence.md
springboot-data-jpa-mysql-generationtype-table.md
springboot-data-jpa-mysql-generationtype-uuid.md

# @GeneratedValue(strategy = GenerationType.AUTO)
# @GeneratedValue(strategy = GenerationType.IDENTITY)
# @GeneratedValue(strategy = GenerationType.SEQUENCE)
# @GeneratedValue(strategy = GenerationType.TABLE)
# @GeneratedValue(strategy = GenerationType.UUID)

[return to README.md](/README.md)
  

[springboot data jpa mysql generationtype auto](/doc/springboot-data-jpa-mysql-generationtype-auto.md)
[springboot data jpa mysql generationtype identity](/doc/springboot-data-jpa-mysql-generationtyp-identity.md)
[springboot data jpa mysql generationtype sequence](/doc/springboot-data-jpa-mysql-generationtype-sequence.md)
[springboot data jpa mysql generationtype table](/doc/springboot-data-jpa-mysql-generationtype-table.md)
[springboot data jpa mysql generationtype uuid](/doc/springboot-data-jpa-mysql-generationtype-uuid.md)



# @GeneratedValue(strategy = GenerationType.AUTO)
# @GeneratedValue(strategy = GenerationType.IDENTITY)
# @GeneratedValue(strategy = GenerationType.SEQUENCE)
# @GeneratedValue(strategy = GenerationType.TABLE)
# @GeneratedValue(strategy = GenerationType.UUID)

