/*     */ package com.intellij.ml.llm.matterhorn.settings;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @State(name = "MatterhornModelPersistentStateComponent", storages = {@Storage("MatterhornModelPersistentStateComponent.xml")})
/*     */ @Service({Service.Level.APP})
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b\f\n\002\020 \n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\005\b\007\030\0002\b\022\004\022\0020\0020\001B\007¢\006\004\b\003\020\004J\016\020\035\032\0020\0362\006\020\037\032\0020\027J\016\020 \032\0020\0362\006\020\037\032\0020\027J\020\020!\032\0020\0362\006\020\"\032\0020\002H\026R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\027\020\b\032\b\022\004\022\0020\0070\t¢\006\b\n\000\032\004\b\n\020\013R$\020\r\032\0020\0072\006\020\f\032\0020\0078F@FX\016¢\006\f\032\004\b\016\020\017\"\004\b\020\020\021R\024\020\022\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\027\020\023\032\b\022\004\022\0020\0070\t¢\006\b\n\000\032\004\b\023\020\013R$\020\024\032\0020\0072\006\020\f\032\0020\0078F@FX\016¢\006\f\032\004\b\024\020\017\"\004\b\025\020\021R0\020\030\032\b\022\004\022\0020\0270\0262\f\020\f\032\b\022\004\022\0020\0270\0268F@FX\016¢\006\f\032\004\b\031\020\032\"\004\b\033\020\034¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;", "Lcom/intellij/openapi/components/SimplePersistentStateComponent;", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelState;", "<init>", "()V", "_braveModeFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "braveModeFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getBraveModeFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "value", "braveMode", "getBraveMode", "()Z", "setBraveMode", "(Z)V", "_isDataSharingEnabledFlow", "isDataSharingEnabledFlow", "isDataSharingEnabled", "setDataSharingEnabled", "", "Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;", "actionWhiteList", "getActionWhiteList", "()Ljava/util/List;", "setActionWhiteList", "(Ljava/util/List;)V", "addActionToWhiteList", "", "actionRule", "removeActionFromWhiteList", "loadState", "state", "core"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornModelPersistentStateComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornModelPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1611#2,9:107\n1863#2:116\n1864#2:118\n1620#2:119\n774#2:120\n865#2,2:121\n1557#2:123\n1628#2,3:124\n2632#2,3:127\n1#3:117\n*S KotlinDebug\n*F\n+ 1 MatterhornModelPersistentStateComponent.kt\ncom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent\n*L\n40#1:107,9\n40#1:116\n40#1:118\n40#1:119\n49#1:120\n49#1:121,2\n49#1:123\n49#1:124,3\n60#1:127,3\n40#1:117\n*E\n"})
/*     */ public final class MatterhornModelPersistentStateComponent extends SimplePersistentStateComponent<MatterhornModelState> {
/*     */   @NotNull
/*     */   private final MutableStateFlow<Boolean> _braveModeFlow;
/*     */   @NotNull
/*     */   private final StateFlow<Boolean> braveModeFlow;
/*     */   
/*  16 */   public MatterhornModelPersistentStateComponent() { super(new MatterhornModelState());
/*     */     
/*  18 */     this._braveModeFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(((MatterhornModelState)getState()).getBraveMode$core()));
/*  19 */     this.braveModeFlow = (StateFlow<Boolean>)this._braveModeFlow;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  28 */     this._isDataSharingEnabledFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(((MatterhornModelState)getState()).isDataSharingEnabled$core()));
/*  29 */     this.isDataSharingEnabledFlow = (StateFlow<Boolean>)this._isDataSharingEnabledFlow; } @NotNull private final MutableStateFlow<Boolean> _isDataSharingEnabledFlow; @NotNull private final StateFlow<Boolean> isDataSharingEnabledFlow; @NotNull public final StateFlow<Boolean> getBraveModeFlow() { return this.braveModeFlow; } public final boolean getBraveMode() { return ((Boolean)this._braveModeFlow.getValue()).booleanValue(); } public final void setBraveMode(boolean value) { ((MatterhornModelState)getState()).setBraveMode$core(value); this._braveModeFlow.setValue(Boolean.valueOf(value)); } @NotNull public final StateFlow<Boolean> isDataSharingEnabledFlow() { return this.isDataSharingEnabledFlow; }
/*     */   
/*     */   public final boolean isDataSharingEnabled() {
/*  32 */     return ((Boolean)this._isDataSharingEnabledFlow.getValue()).booleanValue();
/*     */   } public final void setDataSharingEnabled(boolean value) {
/*  34 */     ((MatterhornModelState)getState()).setDataSharingEnabled$core(value);
/*  35 */     this._isDataSharingEnabledFlow.setValue(Boolean.valueOf(value));
/*     */   }
/*     */   
/*     */   @NotNull
/*  39 */   public final List<ActionRule> getActionWhiteList() { List<MatterhornModelState.Allowed> list1 = ((MatterhornModelState)getState()).getActionWhiteList$core();
/*  40 */     int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     List<MatterhornModelState.Allowed> list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     Iterable<MatterhornModelState.Allowed> $this$forEach$iv$iv$iv = list2; int $i$f$forEach = 0;
/* 116 */     Iterator<MatterhornModelState.Allowed> iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; MatterhornModelState.Allowed it = (MatterhornModelState.Allowed)element$iv$iv;
/*     */       int $i$a$-mapNotNull-MatterhornModelPersistentStateComponent$actionWhiteList$1 = 0; }
/*     */     
/* 119 */     return (List<ActionRule>)destination$iv$iv; } public final void setActionWhiteList(@NotNull List value) { Intrinsics.checkNotNullParameter(value, "value"); List list1 = value; MatterhornModelState matterhornModelState = (MatterhornModelState)getState(); int $i$f$filter = 0;
/* 120 */     List list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 121 */     for (Object element$iv$iv : list2) { ActionRule it = (ActionRule)element$iv$iv; int $i$a$-filter-MatterhornModelPersistentStateComponent$actionWhiteList$2 = 0; if (it.validate()) collection.add(element$iv$iv);  }
/* 122 */      Iterable $this$filter$iv = collection; matterhornModelState = matterhornModelState; int $i$f$map = 0;
/* 123 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 124 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 125 */       ActionRule actionRule = (ActionRule)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-MatterhornModelPersistentStateComponent$actionWhiteList$3 = 0; MatterhornModelState.Allowed allowed1 = new MatterhornModelState.Allowed(), it = allowed1; int $i$a$-also-MatterhornModelPersistentStateComponent$actionWhiteList$3$1 = 0; it.setActionType(actionRule.getActionType()); it.setActionRegex(actionRule.getActionRegex());
/* 126 */     }  matterhornModelState.setActionWhiteList$core(CollectionsKt.toMutableList(CollectionsKt.distinct(destination$iv$iv)));
/*     */     ((MatterhornModelState)getState()).update(); }
/*     */ 
/*     */   
/*     */   public final void addActionToWhiteList(@NotNull ActionRule actionRule) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'actionRule'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic isCurrentThreadEdt : ()Z
/*     */     //   9: istore_2
/*     */     //   10: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   13: ifeq -> 32
/*     */     //   16: iload_2
/*     */     //   17: ifne -> 32
/*     */     //   20: ldc 'Assertion failed'
/*     */     //   22: astore_3
/*     */     //   23: new java/lang/AssertionError
/*     */     //   26: dup
/*     */     //   27: aload_3
/*     */     //   28: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   31: athrow
/*     */     //   32: aload_0
/*     */     //   33: invokevirtual getState : ()Lcom/intellij/openapi/components/BaseState;
/*     */     //   36: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelState
/*     */     //   39: invokevirtual getActionWhiteList$core : ()Ljava/util/List;
/*     */     //   42: checkcast java/lang/Iterable
/*     */     //   45: astore_2
/*     */     //   46: iconst_0
/*     */     //   47: istore_3
/*     */     //   48: aload_2
/*     */     //   49: instanceof java/util/Collection
/*     */     //   52: ifeq -> 71
/*     */     //   55: aload_2
/*     */     //   56: checkcast java/util/Collection
/*     */     //   59: invokeinterface isEmpty : ()Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_1
/*     */     //   68: goto -> 148
/*     */     //   71: aload_2
/*     */     //   72: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   77: astore #4
/*     */     //   79: aload #4
/*     */     //   81: invokeinterface hasNext : ()Z
/*     */     //   86: ifeq -> 147
/*     */     //   89: aload #4
/*     */     //   91: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   96: astore #5
/*     */     //   98: aload #5
/*     */     //   100: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed
/*     */     //   103: astore #6
/*     */     //   105: iconst_0
/*     */     //   106: istore #7
/*     */     //   108: aload #6
/*     */     //   110: invokevirtual getActionType : ()Lcom/intellij/ml/llm/matterhorn/ActionType;
/*     */     //   113: aload_1
/*     */     //   114: invokevirtual getActionType : ()Lcom/intellij/ml/llm/matterhorn/ActionType;
/*     */     //   117: if_acmpne -> 139
/*     */     //   120: aload #6
/*     */     //   122: invokevirtual getActionRegex : ()Ljava/lang/String;
/*     */     //   125: aload_1
/*     */     //   126: invokevirtual getActionRegex : ()Ljava/lang/String;
/*     */     //   129: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   132: ifeq -> 139
/*     */     //   135: iconst_1
/*     */     //   136: goto -> 140
/*     */     //   139: iconst_0
/*     */     //   140: ifeq -> 79
/*     */     //   143: iconst_0
/*     */     //   144: goto -> 148
/*     */     //   147: iconst_1
/*     */     //   148: ifeq -> 212
/*     */     //   151: aload_0
/*     */     //   152: invokevirtual getState : ()Lcom/intellij/openapi/components/BaseState;
/*     */     //   155: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelState
/*     */     //   158: invokevirtual getActionWhiteList$core : ()Ljava/util/List;
/*     */     //   161: new com/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed
/*     */     //   164: dup
/*     */     //   165: invokespecial <init> : ()V
/*     */     //   168: astore_2
/*     */     //   169: aload_2
/*     */     //   170: astore_3
/*     */     //   171: astore #8
/*     */     //   173: iconst_0
/*     */     //   174: istore #4
/*     */     //   176: aload_3
/*     */     //   177: aload_1
/*     */     //   178: invokevirtual getActionType : ()Lcom/intellij/ml/llm/matterhorn/ActionType;
/*     */     //   181: invokevirtual setActionType : (Lcom/intellij/ml/llm/matterhorn/ActionType;)V
/*     */     //   184: aload_3
/*     */     //   185: aload_1
/*     */     //   186: invokevirtual getActionRegex : ()Ljava/lang/String;
/*     */     //   189: invokevirtual setActionRegex : (Ljava/lang/String;)V
/*     */     //   192: nop
/*     */     //   193: aload #8
/*     */     //   195: aload_2
/*     */     //   196: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   201: pop
/*     */     //   202: aload_0
/*     */     //   203: invokevirtual getState : ()Lcom/intellij/openapi/components/BaseState;
/*     */     //   206: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelState
/*     */     //   209: invokevirtual update : ()V
/*     */     //   212: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 6
/*     */     //   #60	-> 32
/*     */     //   #127	-> 48
/*     */     //   #128	-> 71
/*     */     //   #60	-> 108
/*     */     //   #128	-> 140
/*     */     //   #129	-> 147
/*     */     //   #60	-> 148
/*     */     //   #61	-> 151
/*     */     //   #62	-> 161
/*     */     //   #63	-> 176
/*     */     //   #64	-> 184
/*     */     //   #65	-> 192
/*     */     //   #62	-> 195
/*     */     //   #61	-> 196
/*     */     //   #67	-> 202
/*     */     //   #69	-> 212
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   108	32	7	$i$a$-none-MatterhornModelPersistentStateComponent$addActionToWhiteList$1	I
/*     */     //   105	35	6	it	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed;
/*     */     //   98	49	5	element$iv	Ljava/lang/Object;
/*     */     //   48	100	3	$i$f$none	I
/*     */     //   46	102	2	$this$none$iv	Ljava/lang/Iterable;
/*     */     //   176	17	4	$i$a$-also-MatterhornModelPersistentStateComponent$addActionToWhiteList$2	I
/*     */     //   173	20	3	it	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelState$Allowed;
/*     */     //   0	213	0	this	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*     */     //   0	213	1	actionRule	Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;
/*     */   }
/*     */   
/*     */   public final void removeActionFromWhiteList(@NotNull ActionRule actionRule) {
/*     */     Intrinsics.checkNotNullParameter(actionRule, "actionRule");
/*     */     boolean bool = EDT.isCurrentThreadEdt();
/*     */     if (_Assertions.ENABLED && !bool) {
/*     */       String str = "Assertion failed";
/*     */       throw new AssertionError(str);
/*     */     } 
/*     */     ((MatterhornModelState)getState()).getActionWhiteList$core().removeIf(actionRule::removeActionFromWhiteList$lambda$6::removeActionFromWhiteList$lambda$7);
/*     */     ((MatterhornModelState)getState()).update();
/*     */   }
/*     */   
/*     */   private static final boolean removeActionFromWhiteList$lambda$6(ActionRule $actionRule, MatterhornModelState.Allowed it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return (it.getActionType() == $actionRule.getActionType() && Intrinsics.areEqual(it.getActionRegex(), $actionRule.getActionRegex()));
/*     */   }
/*     */   
/*     */   private static final boolean removeActionFromWhiteList$lambda$7(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   public void loadState(@NotNull MatterhornModelState state) {
/*     */     Intrinsics.checkNotNullParameter(state, "state");
/*     */     super.loadState(state);
/*     */     this._braveModeFlow.setValue(Boolean.valueOf(state.getBraveMode$core()));
/*     */     this._isDataSharingEnabledFlow.setValue(Boolean.valueOf(state.isDataSharingEnabled$core()));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\settings\MatterhornModelPersistentStateComponent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */