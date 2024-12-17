import {Component, PropsWithChildren} from 'react'
import {Text, View} from '@tarojs/components'

import "taro-ui/dist/style/components/button.scss" // 按需引入
import './index.scss'

export default class Index extends Component<PropsWithChildren> {
  componentDidMount() {
  }

  componentWillUnmount() {
  }

  componentDidShow() {
  }

  componentDidHide() {
  }

  render() {
    return (

      <View className='index'>
        <Text>用户页面</Text>
      </View>
    )
  }
}
