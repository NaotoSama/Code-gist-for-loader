/**
 * Be sure to also import the following statements so that we can reference these classes in the code.
 * import android.app.LoaderManager;
 * import android.app.LoaderManager.LoaderCallbacks;
 * import android.content.Loader;
 */

import android.os.Bundle;


public class EarthquakeActivity extends AppCompatActivity
        implements LoaderCallbacks<List<Earthquake>> {

    ...

    @Override
    public Loader<List<Earthquake>> onCreateLoader(int i, Bundle bundle) {
        // TODO: Create a new loader for the given URL
    }

    @Override
    public void onLoadFinished(Loader<List<Earthquake>> loader, List<Earthquake> earthquakes) {
        // TODO: Update the UI with the result
    }

    @Override
    public void onLoaderReset(Loader<List<Earthquake>> loader) {
        // TODO: Loader reset, so we can clear out our existing data.
    }
}