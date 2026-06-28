package com.android.superuser.data.repository

import com.android.superuser.data.model.RepoModule

interface ModuleRepoRepository {
    suspend fun fetchModules(): Result<List<RepoModule>>
}
