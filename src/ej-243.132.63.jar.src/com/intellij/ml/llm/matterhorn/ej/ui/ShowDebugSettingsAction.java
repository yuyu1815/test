/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ import com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettings;
/*    */ import com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService;
/*    */ import com.intellij.ml.llm.matterhorn.core.llm.settings.Value;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.Map;
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\001\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\020\020\b\032\0020\0052\006\020\t\032\0020\nH\002¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ShowDebugSettingsAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "<init>", "()V", "actionPerformed", "", "event", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "createScratchFile", "project", "Lcom/intellij/openapi/project/Project;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nShowDebugSettingsAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowDebugSettingsAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ShowDebugSettingsAction\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n535#2:39\n520#2,6:40\n1053#3:46\n*S KotlinDebug\n*F\n+ 1 ShowDebugSettingsAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ShowDebugSettingsAction\n*L\n25#1:39\n25#1:40,6\n25#1:46\n*E\n"})
/*    */ public final class ShowDebugSettingsAction extends AnAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent event) {
/*    */     Project project;
/* 15 */     Intrinsics.checkNotNullParameter(event, "event"); if (event.getProject() == null) { event.getProject(); return; }
/* 16 */      createScratchFile(project);
/*    */   }
/*    */   public static final int $stable;
/*    */   private final void createScratchFile(Project project) {
/* 20 */     String fileName = "DebugSettings.txt";
/* 21 */     MatterhornSettingsService service = MatterhornSettingsService.Companion.getInstance();
/* 22 */     MatterhornSettings settings = (MatterhornSettings)BuildersKt.runBlocking$default(null, new ShowDebugSettingsAction$createScratchFile$settings$1(service, null), 1, null);
/*    */ 
/*    */     
/* 25 */     Map $this$filter$iv = settings.getNameToValue(); int $i$f$filter = 0;
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
/* 39 */     Map map1 = $this$filter$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 40 */     for (Map.Entry element$iv$iv : map1.entrySet()) {
/* 41 */       Map.Entry it = element$iv$iv; int $i$a$-filter-ShowDebugSettingsAction$createScratchFile$text$1 = 0; if ((it.getValue() != null)) {
/* 42 */         destination$iv$iv.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*    */       }
/*    */     } 
/* 45 */     Iterable<Map.Entry<Object, Object>> $this$sortedBy$iv = destination$iv$iv.entrySet(); int $i$f$sortedBy = 0;
/* 46 */     String text = CollectionsKt.joinToString$default(CollectionsKt.sortedWith($this$sortedBy$iv, new ShowDebugSettingsAction$createScratchFile$$inlined$sortedBy$1()), "\n", null, null, 0, null, ShowDebugSettingsAction::createScratchFile$lambda$2, 30, null);
/*    */     VirtualFile scratchFile = ScratchRootType.getInstance().createScratchFile(project, fileName, Language.findLanguageByID("TEXT"), text, ScratchFileService.Option.create_if_missing);
/*    */     Intrinsics.checkNotNull(scratchFile);
/*    */     FileEditorManager.getInstance(project).openFile(scratchFile, true);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ShowDebugSettingsAction.kt", l = {23}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ShowDebugSettingsAction$createScratchFile$settings$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class ShowDebugSettingsAction$createScratchFile$settings$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MatterhornSettings>, Object> {
/*    */     int label;
/*    */     
/*    */     ShowDebugSettingsAction$createScratchFile$settings$1(MatterhornSettingsService $service, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (this.$service.getSettings((Continuation)this) == object)
/*    */             return object; 
/*    */           return this.$service.getSettings((Continuation)this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super ShowDebugSettingsAction$createScratchFile$settings$1> $completion) {
/*    */       return (Continuation<Unit>)new ShowDebugSettingsAction$createScratchFile$settings$1(this.$service, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((ShowDebugSettingsAction$createScratchFile$settings$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final CharSequence createScratchFile$lambda$2(Map.Entry it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     (Value)it.getValue();
/*    */     (Value)it.getValue();
/*    */     return "" + (((Value)it.getValue() != null) ? (CharSequence)((Value)it.getValue()).getOrigin() : null) + " " + (((Value)it.getValue() != null) ? (CharSequence)((Value)it.getValue()).getOrigin() : null) + " : " + it.getKey();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ShowDebugSettingsAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */