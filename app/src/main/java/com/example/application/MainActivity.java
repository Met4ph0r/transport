package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_screen_01__start_booking);

//        String apiKey = getString(R.string.api_key);
//        if (!Places.isInitialized()) {
//            Places.initialize(getApplicationContext(), apiKey);
//        }
//
//        // Create a new Places client instance.
//        PlacesClient placesClient = Places.createClient(this);
//
//        // Initialize the AutocompleteSupportFragment.
//        AutocompleteSupportFragment autocompleteFragment = (AutocompleteSupportFragment)
//                getSupportFragmentManager().findFragmentById(R.id.autocomplete_fragment);
//
//        assert autocompleteFragment != null;
//        autocompleteFragment.setPlaceFields(Arrays.asList(Place.Field.ID, Place.Field.NAME));
//
//        //Styling
//        ((autocompleteFragment.getView()!!.findViewById(R.id.places_autocomplete_search_input)) as EditText).textSize = 30.0f
//
//        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
//            @Override
//            public void onPlaceSelected(@NonNull Place place) {
//                // TODO: Get info about the selected place.
//                Log.i(TAG, "Place: " + place.getName() + ", " + place.getId());
//            }

//            @Override
//            public void onError(@NonNull Status status) {
//                // TODO: Handle the error.
//                Log.i(TAG, "An error occurred: " + status);
//            }
//        });
//    }



//                                // Initialize the AutocompleteSupportFragment.
//                                AutocompleteSupportFragment autocompleteFragment = (AutocompleteSupportFragment)
//                                        getSupportFragmentManager().findFragmentById(R.id.autocomplete_fragment);
//
//                                // Specify the types of place data to return.
//                                assert autocompleteFragment != null;
//                                autocompleteFragment.setPlaceFields(Arrays.asList(Place.Field.ID, Place.Field.NAME));
//
//                                // Set up a PlaceSelectionListener to handle the response.
//                                autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
//                                    @Override
//                                    public void onPlaceSelected(@NonNull Place place) {
//                                        // TODO: Get info about the selected place.
//                                        Log.i(TAG, "Place: " + place.getName() + ", " + place.getId());
//                                    }
//
//
//                                    @Override
//                                    public void onError(@NonNull Status status) {
//                                        // TODO: Handle the error.
//                                        Log.i(TAG, "An error occurred: " + status);
//                                    }
//                                });


                //        final ActivityResultLauncher<Intent> startAutocomplete = registerForActivityResult(
                //                new ActivityResultContracts.StartActivityForResult(),
                //                result -> {
                //                    if (result.getResultCode() == Activity.RESULT_OK) {
                //                        Intent intent = result.getData();
                //                        if (intent != null) {
                //                            Place place = Autocomplete.getPlaceFromIntent(intent);
                //
                //                            // Write a method to read the address components from the Place
                //                            // and populate the form with the address components
                //                            Log.d(TAG, "Place: " + place.getAddressComponents());
                ////                            fillInAddress(place);
                //                        }
                //                    } else if (result.getResultCode() == Activity.RESULT_CANCELED) {
                //                        // The user canceled the operation.
                //                        Log.i(TAG, "User canceled autocomplete");
                //                    }
                //                });
    }
}