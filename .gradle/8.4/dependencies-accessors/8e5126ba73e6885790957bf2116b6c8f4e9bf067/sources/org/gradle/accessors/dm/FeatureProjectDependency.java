package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class FeatureProjectDependency extends DelegatingProjectDependency {

    @Inject
    public FeatureProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:home"
     */
    public Feature_HomeProjectDependency getHome() { return new Feature_HomeProjectDependency(getFactory(), create(":feature:home")); }

    /**
     * Creates a project dependency on the project at path ":feature:tasks"
     */
    public Feature_TasksProjectDependency getTasks() { return new Feature_TasksProjectDependency(getFactory(), create(":feature:tasks")); }

    /**
     * Creates a project dependency on the project at path ":feature:todayTasks"
     */
    public Feature_TodayTasksProjectDependency getTodayTasks() { return new Feature_TodayTasksProjectDependency(getFactory(), create(":feature:todayTasks")); }

}
