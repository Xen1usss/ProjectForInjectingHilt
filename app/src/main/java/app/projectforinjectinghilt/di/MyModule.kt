package app.projectforinjectinghilt.di

import app.projectforinjectinghilt.ViewModelForFragmentMain
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MyModule {

    @Provides
    fun provideString() = "Test"
}