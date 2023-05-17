import React from 'react';
import { Provider } from 'react-redux'
import { store } from './src/store/index'
import BottomNavigation from './src/navigation'
import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  View
} from 'react-native';



function App(): JSX.Element {
  return (
    // <Provider store={store}>
      <BottomNavigation />
    // </Provider>
  );
}

const styles = StyleSheet.create({

});

export default App;
