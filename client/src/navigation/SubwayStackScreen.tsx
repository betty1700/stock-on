import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import Subway from '../screen/Subway'


export default function HomeStackScreen() {
  const SubwayStack = createNativeStackNavigator()

  return (
    <SubwayStack.Navigator>
      <SubwayStack.Screen
        name="Subway"
        component={Subway}        
        options={{ headerShown: false}}
      />
    </SubwayStack.Navigator>
  )
}