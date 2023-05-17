import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import MyPage from '../screen/MyPage'


export default function HomeStackScreen() {
  const MyPageStack = createNativeStackNavigator()

  return (
    <MyPageStack.Navigator>
      <MyPageStack.Screen
        name="MyPage"
        component={MyPage}        
        options={{ headerShown: false}}
      />
    </MyPageStack.Navigator>
  )
}