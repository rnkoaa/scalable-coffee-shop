package org.agyei.richard.beans.control;

public class BeansResource {
    /*
     @Inject
    BeanCommandService commandService;

    @Inject
    BeanQueryService queryService;

    @GET
    public JsonObject getBeans() {
        final JsonObjectBuilder builder = Json.createObjectBuilder();
        queryService.getStoredBeans()
                .entrySet().forEach(e -> builder.add(e.getKey(), e.getValue()));
        return builder.build();
    }

    @POST
    public void storeBeans(JsonObject object) {
        final String beanOrigin = object.getString("beanOrigin", null);
        final int amount = object.getInt("amount", 0);

        if (beanOrigin == null || amount == 0)
            throw new BadRequestException();

        commandService.storeBeans(beanOrigin, amount);
    }

     */
}
