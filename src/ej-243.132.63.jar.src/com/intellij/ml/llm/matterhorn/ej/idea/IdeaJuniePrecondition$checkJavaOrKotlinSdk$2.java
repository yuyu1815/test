/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ 
/*    */ import com.intellij.openapi.application.CoroutinesKt;
/*    */ import com.intellij.openapi.options.Configurable;
/*    */ import com.intellij.openapi.options.ex.SingleConfigurableEditor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.projectRoots.Sdk;
/*    */ import com.intellij.openapi.roots.ui.configuration.ProjectStructureConfigurable;
/*    */ import com.intellij.openapi.ui.DialogWrapper;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "IdeaJuniePrecondition.kt", l = {44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaJuniePrecondition$checkJavaOrKotlinSdk$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */ final class IdeaJuniePrecondition$checkJavaOrKotlinSdk$2
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super Boolean>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   IdeaJuniePrecondition$checkJavaOrKotlinSdk$2(Project $project, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 43 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 44 */         this.label = 1; if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(this.$project, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { ProjectStructureConfigurable configurable; IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1 editor; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                     
/* 46 */                     configurable = ProjectStructureConfigurable.getInstance(this.$project);
/* 47 */                     editor = new IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1(this.$project, configurable);
/*    */ 
/*    */ 
/*    */ 
/*    */                     
/* 52 */                     return Boxing.boxBoolean(editor.showAndGet()); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1", "Lcom/intellij/openapi/options/ex/SingleConfigurableEditor;", "getStyle", "Lcom/intellij/openapi/ui/DialogWrapper$DialogStyle;", "ej-idea"}) public static final class IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1 extends SingleConfigurableEditor { IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1(Project $project, ProjectStructureConfigurable $configurable) { super($project, (Configurable)$configurable, "SettingsEditor"); } protected DialogWrapper.DialogStyle getStyle() { return DialogWrapper.DialogStyle.COMPACT; } } }(Continuation)this) == object) return object;  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { ProjectStructureConfigurable configurable; IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1 editor; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); configurable = ProjectStructureConfigurable.getInstance(this.$project); editor = new IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1(this.$project, configurable); return Boxing.boxBoolean(editor.showAndGet()); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1", "Lcom/intellij/openapi/options/ex/SingleConfigurableEditor;", "getStyle", "Lcom/intellij/openapi/ui/DialogWrapper$DialogStyle;", "ej-idea"}) public static final class IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1 extends SingleConfigurableEditor {
/*    */                 IdeaJuniePrecondition$checkJavaOrKotlinSdk$2$1$editor$1(Project $project, ProjectStructureConfigurable $configurable) { super($project, (Configurable)$configurable, "SettingsEditor"); }
/* 54 */                 protected DialogWrapper.DialogStyle getStyle() { return DialogWrapper.DialogStyle.COMPACT; } } }(Continuation)this); return Boxing.boxBoolean(IdeaJuniePrecondition.access$hasSdk(IdeaJuniePrecondition.this, this.$project, IdeaJuniePrecondition$checkJavaOrKotlinSdk$2::invokeSuspend$lambda$0));case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(IdeaJuniePrecondition.access$hasSdk(IdeaJuniePrecondition.this, this.$project, IdeaJuniePrecondition$checkJavaOrKotlinSdk$2::invokeSuspend$lambda$0)); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super IdeaJuniePrecondition$checkJavaOrKotlinSdk$2> $completion) { return (Continuation<Unit>)new IdeaJuniePrecondition$checkJavaOrKotlinSdk$2(this.$project, $completion); } public final Object invoke(Continuation<?> p1) { return ((IdeaJuniePrecondition$checkJavaOrKotlinSdk$2)create(p1)).invokeSuspend(Unit.INSTANCE); } private static final boolean invokeSuspend$lambda$0(Sdk it) { return it.getSdkType() instanceof com.intellij.openapi.projectRoots.JavaSdkType; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaJuniePrecondition$checkJavaOrKotlinSdk$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */