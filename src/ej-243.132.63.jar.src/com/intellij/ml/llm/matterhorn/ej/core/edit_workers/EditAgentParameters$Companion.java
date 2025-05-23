/*    */ package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.critique.Critiques;
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLM;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\004\032\0020\005*\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\f\020\t\032\b\022\004\022\0020\0050\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters$Companion;", "", "<init>", "()V", "setupFromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<EditAgentParameters> serializer() {
/* 54 */     return (KSerializer<EditAgentParameters>)EditAgentParameters.$serializer.INSTANCE;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object setupFromEnvironment(@NotNull EditAgentParameters $this$setupFromEnvironment, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters$Companion$setupFromEnvironment$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters$Companion$setupFromEnvironment$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters$Companion$setupFromEnvironment$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters$Companion;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 523, 0 -> 104, 1 -> 191, 2 -> 268, 3 -> 345, 4 -> 422, 5 -> 499
/*    */     //   104: aload #5
/*    */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   109: new kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   112: dup
/*    */     //   113: invokespecial <init> : ()V
/*    */     //   116: astore #4
/*    */     //   118: aload #4
/*    */     //   120: aload_1
/*    */     //   121: aconst_null
/*    */     //   122: iconst_0
/*    */     //   123: aconst_null
/*    */     //   124: aconst_null
/*    */     //   125: iconst_0
/*    */     //   126: bipush #31
/*    */     //   128: aconst_null
/*    */     //   129: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;IILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*    */     //   132: putfield element : Ljava/lang/Object;
/*    */     //   135: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*    */     //   138: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   141: invokevirtual getEDIT_WORKERS_MODEL : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   144: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   147: invokevirtual getEDIT_WORKERS_MODEL_PROVIDER : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   150: aload_2
/*    */     //   151: aload #4
/*    */     //   153: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*    */     //   158: aload #6
/*    */     //   160: aload #6
/*    */     //   162: aload_2
/*    */     //   163: putfield L$0 : Ljava/lang/Object;
/*    */     //   166: aload #6
/*    */     //   168: aload #4
/*    */     //   170: putfield L$1 : Ljava/lang/Object;
/*    */     //   173: aload #6
/*    */     //   175: iconst_1
/*    */     //   176: putfield label : I
/*    */     //   179: invokevirtual setupModel : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   182: dup
/*    */     //   183: aload #7
/*    */     //   185: if_acmpne -> 217
/*    */     //   188: aload #7
/*    */     //   190: areturn
/*    */     //   191: aload #6
/*    */     //   193: getfield L$1 : Ljava/lang/Object;
/*    */     //   196: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   199: astore #4
/*    */     //   201: aload #6
/*    */     //   203: getfield L$0 : Ljava/lang/Object;
/*    */     //   206: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   209: astore_2
/*    */     //   210: aload #5
/*    */     //   212: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   215: aload #5
/*    */     //   217: pop
/*    */     //   218: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*    */     //   221: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   224: invokevirtual getEDIT_WORKERS_NUM_REFLECTIONS : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   227: aload_2
/*    */     //   228: aload #4
/*    */     //   230: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*    */     //   235: aload #6
/*    */     //   237: aload #6
/*    */     //   239: aload_2
/*    */     //   240: putfield L$0 : Ljava/lang/Object;
/*    */     //   243: aload #6
/*    */     //   245: aload #4
/*    */     //   247: putfield L$1 : Ljava/lang/Object;
/*    */     //   250: aload #6
/*    */     //   252: iconst_2
/*    */     //   253: putfield label : I
/*    */     //   256: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   259: dup
/*    */     //   260: aload #7
/*    */     //   262: if_acmpne -> 294
/*    */     //   265: aload #7
/*    */     //   267: areturn
/*    */     //   268: aload #6
/*    */     //   270: getfield L$1 : Ljava/lang/Object;
/*    */     //   273: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   276: astore #4
/*    */     //   278: aload #6
/*    */     //   280: getfield L$0 : Ljava/lang/Object;
/*    */     //   283: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   286: astore_2
/*    */     //   287: aload #5
/*    */     //   289: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   292: aload #5
/*    */     //   294: pop
/*    */     //   295: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*    */     //   298: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   301: invokevirtual getEDIT_WORKERS_CRITIQUE : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   304: aload_2
/*    */     //   305: aload #4
/*    */     //   307: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*    */     //   312: aload #6
/*    */     //   314: aload #6
/*    */     //   316: aload_2
/*    */     //   317: putfield L$0 : Ljava/lang/Object;
/*    */     //   320: aload #6
/*    */     //   322: aload #4
/*    */     //   324: putfield L$1 : Ljava/lang/Object;
/*    */     //   327: aload #6
/*    */     //   329: iconst_3
/*    */     //   330: putfield label : I
/*    */     //   333: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   336: dup
/*    */     //   337: aload #7
/*    */     //   339: if_acmpne -> 371
/*    */     //   342: aload #7
/*    */     //   344: areturn
/*    */     //   345: aload #6
/*    */     //   347: getfield L$1 : Ljava/lang/Object;
/*    */     //   350: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   353: astore #4
/*    */     //   355: aload #6
/*    */     //   357: getfield L$0 : Ljava/lang/Object;
/*    */     //   360: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   363: astore_2
/*    */     //   364: aload #5
/*    */     //   366: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   369: aload #5
/*    */     //   371: pop
/*    */     //   372: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*    */     //   375: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   378: invokevirtual getEDIT_WORKERS_MODEL_NUM_CHOICES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   381: aload_2
/*    */     //   382: aload #4
/*    */     //   384: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*    */     //   389: aload #6
/*    */     //   391: aload #6
/*    */     //   393: aload_2
/*    */     //   394: putfield L$0 : Ljava/lang/Object;
/*    */     //   397: aload #6
/*    */     //   399: aload #4
/*    */     //   401: putfield L$1 : Ljava/lang/Object;
/*    */     //   404: aload #6
/*    */     //   406: iconst_4
/*    */     //   407: putfield label : I
/*    */     //   410: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   413: dup
/*    */     //   414: aload #7
/*    */     //   416: if_acmpne -> 448
/*    */     //   419: aload #7
/*    */     //   421: areturn
/*    */     //   422: aload #6
/*    */     //   424: getfield L$1 : Ljava/lang/Object;
/*    */     //   427: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   430: astore #4
/*    */     //   432: aload #6
/*    */     //   434: getfield L$0 : Ljava/lang/Object;
/*    */     //   437: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   440: astore_2
/*    */     //   441: aload #5
/*    */     //   443: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   446: aload #5
/*    */     //   448: pop
/*    */     //   449: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*    */     //   452: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   455: invokevirtual getEDIT_WORKERS_MODEL_TEMPERATURE : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   458: aload_2
/*    */     //   459: aload #4
/*    */     //   461: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*    */     //   466: aload #6
/*    */     //   468: aload #6
/*    */     //   470: aload #4
/*    */     //   472: putfield L$0 : Ljava/lang/Object;
/*    */     //   475: aload #6
/*    */     //   477: aconst_null
/*    */     //   478: putfield L$1 : Ljava/lang/Object;
/*    */     //   481: aload #6
/*    */     //   483: iconst_5
/*    */     //   484: putfield label : I
/*    */     //   487: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   490: dup
/*    */     //   491: aload #7
/*    */     //   493: if_acmpne -> 516
/*    */     //   496: aload #7
/*    */     //   498: areturn
/*    */     //   499: aload #6
/*    */     //   501: getfield L$0 : Ljava/lang/Object;
/*    */     //   504: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   507: astore #4
/*    */     //   509: aload #5
/*    */     //   511: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   514: aload #5
/*    */     //   516: pop
/*    */     //   517: aload #4
/*    */     //   519: getfield element : Ljava/lang/Object;
/*    */     //   522: areturn
/*    */     //   523: new java/lang/IllegalStateException
/*    */     //   526: dup
/*    */     //   527: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   529: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   532: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #55	-> 60
/*    */     //   #56	-> 109
/*    */     //   #58	-> 135
/*    */     //   #59	-> 138
/*    */     //   #60	-> 144
/*    */     //   #61	-> 150
/*    */     //   #58	-> 151
/*    */     //   #55	-> 188
/*    */     //   #66	-> 217
/*    */     //   #55	-> 265
/*    */     //   #70	-> 294
/*    */     //   #55	-> 342
/*    */     //   #74	-> 371
/*    */     //   #55	-> 419
/*    */     //   #78	-> 448
/*    */     //   #55	-> 496
/*    */     //   #84	-> 516
/*    */     //   #55	-> 523
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   109	26	1	$this$setupFromEnvironment	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*    */     //   109	82	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   210	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   287	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   364	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   441	49	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   118	73	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   201	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   278	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   355	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   432	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   509	14	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   0	533	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	473	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	466	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Unit setupFromEnvironment$lambda$0(Ref.ObjectRef $result, LLM it) {
/* 63 */     Intrinsics.checkNotNullParameter(it, "it"); $result.element = EditAgentParameters.copy$default((EditAgentParameters)$result.element, ModelParameters.copy$default(((EditAgentParameters)$result.element).getModelParameters(), it, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, 32766, null), 0, null, null, 0, 30, null);
/* 64 */     return Unit.INSTANCE;
/*    */   }
/*    */   private static final Unit setupFromEnvironment$lambda$1(Ref.ObjectRef $result, String it) {
/* 67 */     Intrinsics.checkNotNullParameter(it, "it"); $result.element = EditAgentParameters.copy$default((EditAgentParameters)$result.element, null, 0, null, null, Integer.parseInt(it), 15, null);
/* 68 */     return Unit.INSTANCE;
/*    */   }
/*    */   private static final Unit setupFromEnvironment$lambda$2(Ref.ObjectRef $result, String it) {
/* 71 */     Intrinsics.checkNotNullParameter(it, "it"); $result.element = EditAgentParameters.copy$default((EditAgentParameters)$result.element, null, 0, null, Intrinsics.areEqual(it, "null") ? null : Critiques.valueOf(it), 0, 23, null);
/* 72 */     return Unit.INSTANCE;
/*    */   }
/*    */   private static final Unit setupFromEnvironment$lambda$3(Ref.ObjectRef $result, String it) {
/* 75 */     Intrinsics.checkNotNullParameter(it, "it"); $result.element = EditAgentParameters.copy$default((EditAgentParameters)$result.element, null, Integer.parseInt(it), null, null, 0, 29, null);
/* 76 */     return Unit.INSTANCE;
/*    */   }
/*    */   private static final Unit setupFromEnvironment$lambda$4(Ref.ObjectRef $result, String it) {
/* 79 */     Intrinsics.checkNotNullParameter(it, "it"); $result.element = EditAgentParameters.copy$default((EditAgentParameters)$result.element, 
/* 80 */         ModelParameters.copy$default(((EditAgentParameters)$result.element).getModelParameters(), null, false, Double.valueOf(Double.parseDouble(it)), null, null, null, null, null, null, null, null, null, null, 0, null, 32763, null), 0, null, null, 0, 30, null);
/*    */     
/* 82 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AbstractEditWorker.kt", l = {58, 66, 70, 74, 78}, i = {0, 0, 1, 1, 2, 2, 3, 3, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"}, n = {"propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.EditAgentParameters$Companion")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class EditAgentParameters$Companion$setupFromEnvironment$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     EditAgentParameters$Companion$setupFromEnvironment$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return EditAgentParameters.Companion.this.setupFromEnvironment(null, null, (Continuation<? super EditAgentParameters>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\EditAgentParameters$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */