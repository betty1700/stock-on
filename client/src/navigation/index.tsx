import React from 'react'
import Ionicons from 'react-native-vector-icons/Ionicons';
import { NavigationContainer } from '@react-navigation/native'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import HomeStackScreen from './HomeStackScreen'
import SubwayStackScreen from './SubwayStackScreen'
import GPSStackScreen from './GPSStackScreen'
import MyPageStackScreen from './MyPageStackScreen'
// import { RootTabParamList } from '../models/Navigations'

export default function BottomNavigation() {
    const Tab = createBottomTabNavigator()

    return(
        <NavigationContainer>
        <Tab.Navigator
          screenOptions={({ route }) => ({
            tabBarIcon: ({ focused, color, size }) => {
              let iconName
  
              switch (route.name) {
                case 'HomeStackScreen':
                  iconName = 'home'
                  size = 30
                  break
                case 'SubwayStackScreen':
                  iconName = 'subway'
                  size = 32
                  break
                case 'GPSStackScreen':
                  iconName = 'location'
                  size = 32
                  break
                case 'MyPageStackScreen':
                  iconName = 'person-circle-outline'
                  size = 34
                  break
                default:
                  iconName = "add-circle-sharp"
                  break
              }
              return <Ionicons name={iconName} size={size} color={color} />
            },
            tabBarActiveTintColor: 'black',
            tabBarInactiveTintColor: 'gray',
            tabBarShowLabel: false,
            headerShown: false,
          })}
        >
        <Tab.Screen name="HomeStackScreen" component={HomeStackScreen} options={{unmountOnBlur: true}}/>
        <Tab.Screen name="SubwayStackScreen" component={SubwayStackScreen} options={{unmountOnBlur: true}} />
        <Tab.Screen name="GPSStackScreen" component={GPSStackScreen}  options={{unmountOnBlur: true}} />
        <Tab.Screen name="MyPageStackScreen" component={MyPageStackScreen}  options={{unmountOnBlur: true}} />
        </Tab.Navigator>
      </NavigationContainer>
    )

}