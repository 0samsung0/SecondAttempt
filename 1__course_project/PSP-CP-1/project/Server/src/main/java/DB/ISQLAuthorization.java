package DB;

import ComputerEquipmentStore.Authorization;
import ComputerEquipmentStore.Role;

public interface ISQLAuthorization {
    Role getRole(Authorization obj);
}
