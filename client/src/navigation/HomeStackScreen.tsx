import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import Home from '../screen/Home'


export default function HomeStackScreen() {
  const HomeStack = createNativeStackNavigator()

  return (
    <HomeStack.Navigator>
      <HomeStack.Screen
        name="Home"
        component={Home}        
        options={{ headerShown: false}}
      />
    </HomeStack.Navigator>
  )
}