# TestRepository

Four small Android sample apps from learning the basics of the Android SDK. Each
one is a standalone Eclipse ADT project (`AndroidManifest.xml`, `project.properties`,
`src/`, `res/`) targeting API 18, with `minSdkVersion` 8.

| App | Package | What it demonstrates |
| --- | --- | --- |
| [`myFirstApp1`](myFirstApp1) | `com.example.myfirstapp1` | A single activity with one button |
| [`buttonlearn1`](buttonlearn1) | `com.example.buttonlearn1` | Button click handling and passing data between activities with an `Intent` |
| [`listView`](listView) | `com.example.listview` | A `ListView` backed by a custom `ArrayAdapter` |
| [`FragmentsExample`](FragmentsExample) | `com.twistedequations.fragmentsexample` | Support-library fragments and fragment-to-activity communication |

## myFirstApp1

A "hello world" style starter app. `MainActivity` inflates a layout with a single
`Button` (`TestButton`) and looks it up with `findViewById`; no click listener is
wired up yet.

The folder also contains a nested `myFirstApp1/myFirstApp1/` directory, which is
an older copy of the same project.

## buttonlearn1

`MainActivity` shows three buttons and implements `View.OnClickListener`. When a
button is tapped, its label is read, put into an `Intent` as the `mytext` extra,
and a second activity, `Display1`, is started. `Display1` reads the extra and
shows it in a `TextView`.

## listView

`MainActivity` loads a list of planets from a string array
(`res/values/StringArrays.xml`) and shows them in a `ListView` through a custom
`Planetadapter` (an `ArrayAdapter<String>` subclass). The adapter's `getView`
alternates between two row layouts (`listviewrow.xml` and `listview_right.xml`)
for even and odd positions. Tapping a row or its text shows a `Toast` with the
planet name and position.

## FragmentsExample

A list/detail app for chemical elements, built with the Android support library
(`android-support-v4.jar`):

- `MainActivity` (a `FragmentActivity`) hosts `ElementListFragment`, which lists
  element names from `ElementsArray` in `res/values/StringArray.xml`.
- The fragment reports taps back to its activity through the
  `ElementsListClickHandle` callback interface.
- `MainActivity` then starts `ElementsDetailActivity`, passing the tapped
  position in a `Bundle`. That activity adds an `elementDetailFragment` with a
  `FragmentTransaction`, and the fragment shows the matching entry from
  `ElementInfoArray` (atomic number, mass, symbol, melting and boiling points,
  and so on).
- The fragment lifecycle callbacks (`onAttach`, `onCreate`, `onCreateView`,
  `onActivityCreated`) are logged, which makes it easy to follow them in Logcat.
- `res/layout-large-land/main_activity.xml` sets up a two-pane layout with an
  empty `FrameLayout` beside the list for large landscape screens. The
  activity doesn't use it yet: taps always open the separate detail activity.

## Building

These are legacy Eclipse ADT projects. To run one, import its folder into
Eclipse with ADT (**File → Import → Existing Android Code Into Workspace**), or
import it into Android Studio, which converts it to a Gradle project. The
checked-in `gen/` folders hold generated sources (`R.java`, `BuildConfig.java`)
and are rebuilt automatically.
