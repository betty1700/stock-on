import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import GPS from '../screen/GPS'


export default function HomeStackScreen() {
  const GPSStack = createNativeStackNavigator()

  return (
    <GPSStack.Navigator>
      <GPSStack.Screen
        name="GPS"
        component={GPS}        
        options={{ headerShown: false}}
      />
    </GPSStack.Navigator>
  )
}