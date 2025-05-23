/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ 
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.roots.LanguageLevelProjectExtension;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @DebugMetadata(f = "IdeaProjectConfigurator.kt", l = {91, 96}, i = {1, 1}, s = {"J$0", "I$0"}, n = {"waitStartTime", "waitStep"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   long J$0;
/*    */   int I$0;
/*    */   int label;
/*    */   
/*    */   IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4(LanguageLevelProjectExtension $levelProjectExtension, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #7
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 281, 0 -> 36, 1 -> 76, 2 -> 162
/*    */     //   36: aload_1
/*    */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   40: getstatic com/intellij/platform/backend/observation/Observation.INSTANCE : Lcom/intellij/platform/backend/observation/Observation;
/*    */     //   43: aload_0
/*    */     //   44: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*    */     //   47: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;)Lcom/intellij/openapi/project/Project;
/*    */     //   50: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   55: aload_0
/*    */     //   56: checkcast kotlin/coroutines/Continuation
/*    */     //   59: aload_0
/*    */     //   60: iconst_1
/*    */     //   61: putfield label : I
/*    */     //   64: invokevirtual awaitConfiguration : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   67: dup
/*    */     //   68: aload #7
/*    */     //   70: if_acmpne -> 81
/*    */     //   73: aload #7
/*    */     //   75: areturn
/*    */     //   76: aload_1
/*    */     //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   80: aload_1
/*    */     //   81: checkcast java/lang/Boolean
/*    */     //   84: invokevirtual booleanValue : ()Z
/*    */     //   87: istore_2
/*    */     //   88: iload_2
/*    */     //   89: ifeq -> 256
/*    */     //   92: invokestatic currentTimeMillis : ()J
/*    */     //   95: lstore_3
/*    */     //   96: iconst_1
/*    */     //   97: istore #5
/*    */     //   99: invokestatic getCurrentIndicators : ()Ljava/util/List;
/*    */     //   102: dup
/*    */     //   103: ldc 'getCurrentIndicators(...)'
/*    */     //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   108: checkcast java/util/Collection
/*    */     //   111: invokeinterface isEmpty : ()Z
/*    */     //   116: ifne -> 123
/*    */     //   119: iconst_1
/*    */     //   120: goto -> 124
/*    */     //   123: iconst_0
/*    */     //   124: ifeq -> 256
/*    */     //   127: ldc2_w 1000
/*    */     //   130: aload_0
/*    */     //   131: checkcast kotlin/coroutines/Continuation
/*    */     //   134: aload_0
/*    */     //   135: lload_3
/*    */     //   136: putfield J$0 : J
/*    */     //   139: aload_0
/*    */     //   140: iload #5
/*    */     //   142: putfield I$0 : I
/*    */     //   145: aload_0
/*    */     //   146: iconst_2
/*    */     //   147: putfield label : I
/*    */     //   150: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   153: dup
/*    */     //   154: aload #7
/*    */     //   156: if_acmpne -> 178
/*    */     //   159: aload #7
/*    */     //   161: areturn
/*    */     //   162: aload_0
/*    */     //   163: getfield I$0 : I
/*    */     //   166: istore #5
/*    */     //   168: aload_0
/*    */     //   169: getfield J$0 : J
/*    */     //   172: lstore_3
/*    */     //   173: aload_1
/*    */     //   174: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   177: aload_1
/*    */     //   178: pop
/*    */     //   179: invokestatic currentTimeMillis : ()J
/*    */     //   182: lload_3
/*    */     //   183: lsub
/*    */     //   184: iload #5
/*    */     //   186: bipush #60
/*    */     //   188: imul
/*    */     //   189: sipush #1000
/*    */     //   192: imul
/*    */     //   193: i2l
/*    */     //   194: lcmp
/*    */     //   195: ifle -> 99
/*    */     //   198: nop
/*    */     //   199: invokestatic getCurrentIndicators : ()Ljava/util/List;
/*    */     //   202: dup
/*    */     //   203: ldc 'getCurrentIndicators(...)'
/*    */     //   205: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   208: checkcast java/lang/Iterable
/*    */     //   211: aconst_null
/*    */     //   212: aconst_null
/*    */     //   213: aconst_null
/*    */     //   214: iconst_0
/*    */     //   215: aconst_null
/*    */     //   216: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   221: bipush #31
/*    */     //   223: aconst_null
/*    */     //   224: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   227: astore #6
/*    */     //   229: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$Companion;
/*    */     //   232: invokevirtual getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   235: aload #6
/*    */     //   237: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   242: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   245: goto -> 250
/*    */     //   248: astore #6
/*    */     //   250: iinc #5, 1
/*    */     //   253: goto -> 99
/*    */     //   256: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$Companion;
/*    */     //   259: invokevirtual getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   262: aload_0
/*    */     //   263: getfield $levelProjectExtension : Lcom/intellij/openapi/roots/LanguageLevelProjectExtension;
/*    */     //   266: invokevirtual getLanguageLevel : ()Lcom/intellij/pom/java/LanguageLevel;
/*    */     //   269: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/pom/java/LanguageLevel;)Ljava/lang/String;
/*    */     //   274: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   277: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   280: areturn
/*    */     //   281: new java/lang/IllegalStateException
/*    */     //   284: dup
/*    */     //   285: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   287: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   290: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #90	-> 3
/*    */     //   #91	-> 40
/*    */     //   #90	-> 73
/*    */     //   #91	-> 81
/*    */     //   #92	-> 88
/*    */     //   #93	-> 92
/*    */     //   #94	-> 96
/*    */     //   #95	-> 99
/*    */     //   #96	-> 127
/*    */     //   #90	-> 159
/*    */     //   #97	-> 178
/*    */     //   #98	-> 198
/*    */     //   #99	-> 199
/*    */     //   #100	-> 229
/*    */     //   #101	-> 248
/*    */     //   #103	-> 250
/*    */     //   #107	-> 256
/*    */     //   #108	-> 277
/*    */     //   #90	-> 281
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   88	4	2	awaitConfiguration	Z
/*    */     //   96	66	3	waitStartTime	J
/*    */     //   173	83	3	waitStartTime	J
/*    */     //   99	63	5	waitStep	I
/*    */     //   168	88	5	waitStep	I
/*    */     //   229	16	6	indicatorTexts	Ljava/lang/String;
/*    */     //   0	291	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4;
/*    */     //   40	241	1	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   198	245	248	java/lang/Throwable
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4> $completion) {
/*    */     return (Continuation<Unit>)new IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4(this.$levelProjectExtension, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(String it) {
/* 91 */     IdeaProjectConfiguratorHelper.Companion.getLogger().warn(it); return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final CharSequence invokeSuspend$lambda$1(ProgressIndicator it) {
/* 99 */     Intrinsics.checkNotNullExpressionValue(it.getText(), "getText(...)"); return it.getText();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */