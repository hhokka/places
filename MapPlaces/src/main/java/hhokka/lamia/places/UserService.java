package hhokka.lamia.places;

import java.util.Collection;

public interface UserService {
    public void addUser(Place user);

    public Collection<Place> getUsers();

    public Place getUser(String id);

    public Place editUser(Place user) throws PlaceException;

    public void deleteUser(String id);

    public boolean userExist(String id);
}