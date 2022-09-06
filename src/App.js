import React from 'react';
import { Button, View } from 'react-native';
import CalendarModule from './modules/CalendarModule';
const App = () => {

  const onPress = () => {
    CalendarModule.createCalendarEvent('Test');
  };

  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Button
        title="Click to invoke your native module!"
        color="#841584"
        onPress={onPress}
      />
    </View>
  );
};

export default App;