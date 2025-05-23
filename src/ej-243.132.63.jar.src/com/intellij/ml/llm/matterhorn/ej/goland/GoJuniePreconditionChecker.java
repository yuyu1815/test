/*    */ package com.intellij.ml.llm.matterhorn.ej.goland;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*    */ import com.intellij.openapi.module.Module;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\030\002\n\002\020\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\022\020\t\032\004\030\0010\0062\006\020\007\032\0020\bH\002J\020\020\n\032\0020\0132\006\020\007\032\0020\bH\002J\022\020\f\032\004\030\0010\0062\006\020\007\032\0020\bH\002J\022\020\r\032\004\030\0010\0062\006\020\007\032\0020\bH\002J\n\020\016\032\004\030\0010\006H\002J\026\020\017\032\0020\0062\f\020\020\032\b\022\004\022\0020\0220\021H\002¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/goland/GoJuniePreconditionChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker;", "<init>", "()V", "canRunJunie", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "project", "Lcom/intellij/openapi/project/Project;", "checkGoSdkConfigured", "isGoSdkValid", "", "checkGoSupportEnabled", "checkDependencyDownloadingEnabled", "checkDependencyDownloadingEnabledGlobally", "createDependencyDownloadingProblem", "fix", "Lkotlin/Function0;", "", "ej-goland"})
/*    */ @SourceDebugExtension({"SMAP\nGoJuniePreconditionChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoJuniePreconditionChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/GoJuniePreconditionChecker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n4154#2:94\n4254#2,2:95\n*S KotlinDebug\n*F\n+ 1 GoJuniePreconditionChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/GoJuniePreconditionChecker\n*L\n46#1:94\n46#1:95,2\n*E\n"})
/*    */ public final class GoJuniePreconditionChecker extends DefaultJuniePreconditionChecker {
/*    */   @NotNull
/*    */   public List<JuniePreconditionChecker.JunieProblem> canRunJunie(@NotNull Project project) {
/* 19 */     Intrinsics.checkNotNullParameter(project, "project");
/* 20 */     JuniePreconditionChecker.JunieProblem[] arrayOfJunieProblem = new JuniePreconditionChecker.JunieProblem[3]; arrayOfJunieProblem[0] = checkGoSdkConfigured(project); arrayOfJunieProblem[1] = 
/* 21 */       checkGoSupportEnabled(project);
/* 22 */     arrayOfJunieProblem[2] = checkDependencyDownloadingEnabled(project);
/*    */     return CollectionsKt.plus(super.canRunJunie(project), CollectionsKt.listOfNotNull((Object[])arrayOfJunieProblem));
/*    */   }
/*    */   
/*    */   private final JuniePreconditionChecker.JunieProblem checkGoSdkConfigured(Project project) {
/* 27 */     if (isGoSdkValid(project)) {
/* 28 */       return null;
/*    */     }
/*    */     
/* 31 */     return new JuniePreconditionChecker.JunieProblem(
/* 32 */         "Go SDK is not configured", 
/* 33 */         "Configure Go SDK", 
/* 34 */         new GoJuniePreconditionChecker$checkGoSdkConfigured$1(project, null)); } @DebugMetadata(f = "GoJuniePreconditionChecker.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.goland.GoJuniePreconditionChecker$checkGoSdkConfigured$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class GoJuniePreconditionChecker$checkGoSdkConfigured$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { int label; GoJuniePreconditionChecker$checkGoSdkConfigured$1(Project $project, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 35 */           this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 36 */                       return Boxing.boxBoolean(ShowSettingsUtil.getInstance().editConfigurable(this.$project, (Configurable)new GoSdkConfigurable(this.$project, true))); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(ShowSettingsUtil.getInstance().editConfigurable(this.$project, (Configurable)new GoSdkConfigurable(this.$project, true))); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); }
/* 38 */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Boxing.boxBoolean(GoJuniePreconditionChecker.this.isGoSdkValid(this.$project));case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(GoJuniePreconditionChecker.this.isGoSdkValid(this.$project)); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */     public final Continuation<Unit> create(Continuation<? super GoJuniePreconditionChecker$checkGoSdkConfigured$1> $completion) { return (Continuation<Unit>)new GoJuniePreconditionChecker$checkGoSdkConfigured$1(this.$project, $completion); } public final Object invoke(Continuation<?> p1) { return ((GoJuniePreconditionChecker$checkGoSdkConfigured$1)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/* 42 */    private final boolean isGoSdkValid(Project project) { return GoSdkService.getInstance(project).getSdk(null).isValid(); }
/*    */   
/*    */   private final JuniePreconditionChecker.JunieProblem checkGoSupportEnabled(Project project) {
/* 45 */     Module[] modules = ModuleManager.Companion.getInstance(project).getModules();
/* 46 */     Module[] arrayOfModule1 = modules; int $i$f$filterNot = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 94 */     Module[] arrayOfModule2 = arrayOfModule1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0; byte b; int i;
/* 95 */     for (b = 0, i = arrayOfModule2.length; b < i; ) { Object element$iv$iv = arrayOfModule2[b], object1 = element$iv$iv; int $i$a$-filterNot-GoJuniePreconditionChecker$checkGoSupportEnabled$modulesWithoutGoSupport$1 = 0; if (!GoModuleSettings.getInstance((Module)object1).isGoSupportEnabled()) destination$iv$iv.add(element$iv$iv);  }
/* 96 */      List<? extends Module> modulesWithoutGoSupport = (List)destination$iv$iv;
/*    */     if (modulesWithoutGoSupport.isEmpty())
/*    */       return null; 
/*    */     return new JuniePreconditionChecker.JunieProblem("Go support is disabled for some modules", "Enable", new GoJuniePreconditionChecker$checkGoSupportEnabled$1(modulesWithoutGoSupport, null));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GoJuniePreconditionChecker.kt", l = {54}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.goland.GoJuniePreconditionChecker$checkGoSupportEnabled$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */   static final class GoJuniePreconditionChecker$checkGoSupportEnabled$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
/*    */     int label;
/*    */     
/*    */     GoJuniePreconditionChecker$checkGoSupportEnabled$1(List<Module> $modulesWithoutGoSupport, Continuation $completion) {
/*    */       super(1, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$modulesWithoutGoSupport, null) {
/*    */                 int label;
/*    */                 
/*    */                 public final Object invokeSuspend(Object $result) {
/*    */                   Iterable<Module> $this$forEach$iv;
/*    */                   int $i$f$forEach;
/*    */                   Iterator<Module> iterator;
/*    */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       $this$forEach$iv = this.$modulesWithoutGoSupport;
/*    */                       $i$f$forEach = 0;
/*    */                       iterator = $this$forEach$iv.iterator();
/*    */                       if (iterator.hasNext()) {
/*    */                         Object element$iv = iterator.next();
/*    */                         Module it = (Module)element$iv;
/*    */                         int $i$a$-forEach-GoJuniePreconditionChecker$checkGoSupportEnabled$1$1$1 = 0;
/*    */                         GoModuleSettings.getInstance(it).setGoSupportEnabled(true);
/*    */                       } 
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$modulesWithoutGoSupport, $completion);
/*    */                 }
/*    */                 
/*    */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this) == object)
/*    */             return object; 
/*    */           BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$modulesWithoutGoSupport, null) {
/*    */                 int label;
/*    */                 
/*    */                 public final Object invokeSuspend(Object $result) {
/*    */                   Iterable<Module> $this$forEach$iv;
/*    */                   int $i$f$forEach;
/*    */                   Iterator<Module> iterator;
/*    */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       $this$forEach$iv = this.$modulesWithoutGoSupport;
/*    */                       $i$f$forEach = 0;
/*    */                       iterator = $this$forEach$iv.iterator();
/*    */                       if (iterator.hasNext()) {
/*    */                         Object element$iv = iterator.next();
/*    */                         Module it = (Module)element$iv;
/*    */                         int $i$a$-forEach-GoJuniePreconditionChecker$checkGoSupportEnabled$1$1$1 = 0;
/*    */                         GoModuleSettings.getInstance(it).setGoSupportEnabled(true);
/*    */                       } 
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$modulesWithoutGoSupport, $completion);
/*    */                 }
/*    */                 
/*    */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this);
/*    */           return Boxing.boxBoolean(true);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Boxing.boxBoolean(true);
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super GoJuniePreconditionChecker$checkGoSupportEnabled$1> $completion) {
/*    */       return (Continuation<Unit>)new GoJuniePreconditionChecker$checkGoSupportEnabled$1(this.$modulesWithoutGoSupport, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((GoJuniePreconditionChecker$checkGoSupportEnabled$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   private final JuniePreconditionChecker.JunieProblem checkDependencyDownloadingEnabled(Project project) {
/*    */     Boolean bool = VgoProjectSettings.getInstance(project).isAutomaticDependenciesDownloadEnabled();
/*    */     if (bool == null) {
/*    */     
/*    */     } else {
/*    */       throw new NoWhenBranchMatchedException();
/*    */     } 
/*    */     return Intrinsics.areEqual(bool, Boolean.valueOf(true)) ? null : (Intrinsics.areEqual(bool, Boolean.valueOf(false)) ? createDependencyDownloadingProblem(project::checkDependencyDownloadingEnabled$lambda$1) : (JuniePreconditionChecker.JunieProblem)"JD-Core does not support Kotlin");
/*    */   }
/*    */   
/*    */   private static final Unit checkDependencyDownloadingEnabled$lambda$1(Project $project) {
/*    */     VgoProjectSettings.getInstance($project).setAutomaticDependenciesDownloadEnabled(Boolean.valueOf(true));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private final JuniePreconditionChecker.JunieProblem checkDependencyDownloadingEnabledGlobally() {
/*    */     if (VgoSettings.getInstance().isAutomaticDependenciesDownloadGloballyEnabled())
/*    */       return null; 
/*    */     return createDependencyDownloadingProblem(GoJuniePreconditionChecker::checkDependencyDownloadingEnabledGlobally$lambda$2);
/*    */   }
/*    */   
/*    */   private static final Unit checkDependencyDownloadingEnabledGlobally$lambda$2() {
/*    */     VgoSettings.getInstance().setAutomaticDependenciesDownloadGloballyEnabled(true);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private final JuniePreconditionChecker.JunieProblem createDependencyDownloadingProblem(Function0<Unit> fix) {
/*    */     return new JuniePreconditionChecker.JunieProblem("Go dependency downloading is disabled", "Enable", new GoJuniePreconditionChecker$createDependencyDownloadingProblem$1(fix, null));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GoJuniePreconditionChecker.kt", l = {89}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.goland.GoJuniePreconditionChecker$createDependencyDownloadingProblem$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */   static final class GoJuniePreconditionChecker$createDependencyDownloadingProblem$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
/*    */     int label;
/*    */     
/*    */     GoJuniePreconditionChecker$createDependencyDownloadingProblem$1(Function0<Unit> $fix, Continuation $completion) {
/*    */       super(1, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$fix, null) {
/*    */                 int label;
/*    */                 
/*    */                 public final Object invokeSuspend(Object $result) {
/*    */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.$fix.invoke();
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$fix, $completion);
/*    */                 }
/*    */                 
/*    */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this) == object)
/*    */             return object; 
/*    */           BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$fix, null) {
/*    */                 int label;
/*    */                 
/*    */                 public final Object invokeSuspend(Object $result) {
/*    */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.$fix.invoke();
/*    */                       return Unit.INSTANCE;
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function2<>(this.$fix, $completion);
/*    */                 }
/*    */                 
/*    */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation)this);
/*    */           return Boxing.boxBoolean(true);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Boxing.boxBoolean(true);
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super GoJuniePreconditionChecker$createDependencyDownloadingProblem$1> $completion) {
/*    */       return (Continuation<Unit>)new GoJuniePreconditionChecker$createDependencyDownloadingProblem$1(this.$fix, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((GoJuniePreconditionChecker$createDependencyDownloadingProblem$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\GoJuniePreconditionChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */