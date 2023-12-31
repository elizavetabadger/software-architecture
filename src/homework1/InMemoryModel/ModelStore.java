package homework1.InMemoryModel;

import homework1.ModelElements.PoligonalModel;
import homework1.ModelElements.Scene;
import homework1.ModelElements.Flash;
import homework1.ModelElements.Camera;

import java.util.ArrayList;
public class ModelStore implements IModelChanger, IModelChangeObserver {

    ArrayList<PoligonalModel> Models = new ArrayList<>();
    ArrayList<Scene> Scenes = new ArrayList<>();
    ArrayList<Flash> Flashes = new ArrayList<>();
    ArrayList<Camera> Cameras = new ArrayList<>();

    public Scene getScene(int n_scene) {

        return Scenes.get(n_scene);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ApplyUpdateModel() {
        // TODO Auto-generated method stub

    }
}