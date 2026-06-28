package com.android.superuser.data.repository

import com.android.superuser.data.model.Module
import com.android.superuser.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
