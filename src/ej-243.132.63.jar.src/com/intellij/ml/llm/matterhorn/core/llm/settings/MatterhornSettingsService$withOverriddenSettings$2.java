/*    */ package com.intellij.ml.llm.matterhorn.core.llm.settings;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "MatterhornSettingsService.kt", l = {67, 70, 74, 74}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService$withOverriddenSettings$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class MatterhornSettingsService$withOverriddenSettings$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super T>, Object>
/*    */ {
/*    */   Object L$0;
/*    */   int label;
/*    */   
/*    */   MatterhornSettingsService$withOverriddenSettings$2(Function2<CoroutineScope, Continuation<? super T>, Object> $body, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #5
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 222, 0 -> 44, 1 -> 73, 2 -> 116, 3 -> 153, 4 -> 200
/*    */     //   44: aload_1
/*    */     //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   48: aload_0
/*    */     //   49: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*    */     //   52: aload_0
/*    */     //   53: checkcast kotlin/coroutines/Continuation
/*    */     //   56: aload_0
/*    */     //   57: iconst_1
/*    */     //   58: putfield label : I
/*    */     //   61: invokevirtual resetSettings : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   64: dup
/*    */     //   65: aload #5
/*    */     //   67: if_acmpne -> 78
/*    */     //   70: aload #5
/*    */     //   72: areturn
/*    */     //   73: aload_1
/*    */     //   74: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   77: aload_1
/*    */     //   78: pop
/*    */     //   79: nop
/*    */     //   80: new com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$withOverriddenSettings$2$ret$1
/*    */     //   83: dup
/*    */     //   84: aload_0
/*    */     //   85: getfield $body : Lkotlin/jvm/functions/Function2;
/*    */     //   88: aconst_null
/*    */     //   89: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*    */     //   92: checkcast kotlin/jvm/functions/Function2
/*    */     //   95: aload_0
/*    */     //   96: checkcast kotlin/coroutines/Continuation
/*    */     //   99: aload_0
/*    */     //   100: iconst_2
/*    */     //   101: putfield label : I
/*    */     //   104: invokestatic coroutineScope : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   107: dup
/*    */     //   108: aload #5
/*    */     //   110: if_acmpne -> 122
/*    */     //   113: aload #5
/*    */     //   115: areturn
/*    */     //   116: nop
/*    */     //   117: aload_1
/*    */     //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   121: aload_1
/*    */     //   122: astore_3
/*    */     //   123: aload_0
/*    */     //   124: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*    */     //   127: aload_0
/*    */     //   128: checkcast kotlin/coroutines/Continuation
/*    */     //   131: aload_0
/*    */     //   132: aload_3
/*    */     //   133: putfield L$0 : Ljava/lang/Object;
/*    */     //   136: aload_0
/*    */     //   137: iconst_3
/*    */     //   138: putfield label : I
/*    */     //   141: invokevirtual resetSettings : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   144: dup
/*    */     //   145: aload #5
/*    */     //   147: if_acmpne -> 163
/*    */     //   150: aload #5
/*    */     //   152: areturn
/*    */     //   153: aload_0
/*    */     //   154: getfield L$0 : Ljava/lang/Object;
/*    */     //   157: astore_3
/*    */     //   158: aload_1
/*    */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   162: aload_1
/*    */     //   163: pop
/*    */     //   164: goto -> 218
/*    */     //   167: astore #4
/*    */     //   169: aload_0
/*    */     //   170: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*    */     //   173: aload_0
/*    */     //   174: checkcast kotlin/coroutines/Continuation
/*    */     //   177: aload_0
/*    */     //   178: aload #4
/*    */     //   180: putfield L$0 : Ljava/lang/Object;
/*    */     //   183: aload_0
/*    */     //   184: iconst_4
/*    */     //   185: putfield label : I
/*    */     //   188: invokevirtual resetSettings : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   191: dup
/*    */     //   192: aload #5
/*    */     //   194: if_acmpne -> 214
/*    */     //   197: aload #5
/*    */     //   199: areturn
/*    */     //   200: aload_0
/*    */     //   201: getfield L$0 : Ljava/lang/Object;
/*    */     //   204: checkcast java/lang/Throwable
/*    */     //   207: astore #4
/*    */     //   209: aload_1
/*    */     //   210: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   213: aload_1
/*    */     //   214: pop
/*    */     //   215: aload #4
/*    */     //   217: athrow
/*    */     //   218: aload_3
/*    */     //   219: astore_2
/*    */     //   220: aload_2
/*    */     //   221: areturn
/*    */     //   222: new java/lang/IllegalStateException
/*    */     //   225: dup
/*    */     //   226: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   228: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   231: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #66	-> 3
/*    */     //   #67	-> 48
/*    */     //   #66	-> 70
/*    */     //   #69	-> 78
/*    */     //   #70	-> 80
/*    */     //   #66	-> 113
/*    */     //   #74	-> 123
/*    */     //   #66	-> 150
/*    */     //   #75	-> 163
/*    */     //   #74	-> 167
/*    */     //   #66	-> 197
/*    */     //   #69	-> 214
/*    */     //   #77	-> 220
/*    */     //   #66	-> 222
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   220	2	2	ret	Ljava/lang/Object;
/*    */     //   0	232	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$withOverriddenSettings$2;
/*    */     //   48	174	1	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   79	107	167	finally
/*    */     //   116	123	167	finally
/*    */     //   167	169	167	finally
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornSettingsService$withOverriddenSettings$2> $completion) {
/*    */     return (Continuation<Unit>)new MatterhornSettingsService$withOverriddenSettings$2(this.$body, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((MatterhornSettingsService$withOverriddenSettings$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "MatterhornSettingsService.kt", l = {71}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService$withOverriddenSettings$2$ret$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class MatterhornSettingsService$withOverriddenSettings$2$ret$1
/*    */     extends SuspendLambda
/*    */     implements Function2<CoroutineScope, Continuation<? super T>, Object>
/*    */   {
/*    */     int label;
/*    */     
/*    */     MatterhornSettingsService$withOverriddenSettings$2$ret$1(Function2<CoroutineScope, Continuation<? super T>, Object> $body, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       CoroutineScope $this$coroutineScope;
/* 70 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$coroutineScope = (CoroutineScope)this.L$0;
/* 71 */           this.label = 1; if (this.$body.invoke($this$coroutineScope, this) == object) return object;  return this.$body.invoke($this$coroutineScope, this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornSettingsService$withOverriddenSettings$2$ret$1> $completion) {
/*    */       MatterhornSettingsService$withOverriddenSettings$2$ret$1 matterhornSettingsService$withOverriddenSettings$2$ret$1 = new MatterhornSettingsService$withOverriddenSettings$2$ret$1(this.$body, $completion);
/*    */       matterhornSettingsService$withOverriddenSettings$2$ret$1.L$0 = value;
/*    */       return (Continuation<Unit>)matterhornSettingsService$withOverriddenSettings$2$ret$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((MatterhornSettingsService$withOverriddenSettings$2$ret$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\settings\MatterhornSettingsService$withOverriddenSettings$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */