/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\006\032\b\022\004\022\0020\0050\0072\006\020\b\032\0020\005J\022\020\t\032\0020\n*\0020\nH@¢\006\002\020\013J\f\020\f\032\b\022\004\022\0020\n0\rR\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion;", "", "<init>", "()V", "PATHS_SEPARATOR", "", "parsePaths", "", "paths", "setupFromEnvironment", "Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;", "(Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "matterhorn"})
/*     */ @SourceDebugExtension({"SMAP\nCommandLineStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,380:1\n1557#2:381\n1628#2,3:382\n*S KotlinDebug\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion\n*L\n76#1:381\n76#1:382,3\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<CommandLineStarterProjectState> serializer() {
/*  71 */     return (KSerializer<CommandLineStarterProjectState>)CommandLineStarterProjectState.$serializer.INSTANCE;
/*     */   }
/*     */   @NotNull
/*     */   public final List<String> parsePaths(@NotNull String paths) {
/*  75 */     Intrinsics.checkNotNullParameter(paths, "paths"); if (StringsKt.isBlank(paths)) return CollectionsKt.emptyList(); 
/*  76 */     String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; Iterable $this$map$iv = StringsKt.split$default(StringsKt.trim(paths).toString(), arrayOfString, false, 0, 6, null); int $i$f$map = 0;
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
/* 381 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 382 */     for (Object item$iv$iv : iterable1) {
/* 383 */       String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-CommandLineStarterProjectState$Companion$parsePaths$1 = 0; collection.add(StringsKt.trim(str).toString());
/* 384 */     }  return (List<String>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object setupFromEnvironment(@NotNull CommandLineStarterProjectState $this$setupFromEnvironment, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion$setupFromEnvironment$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion$setupFromEnvironment$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion$setupFromEnvironment$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 266, 0 -> 92, 1 -> 168, 2 -> 244
/*     */     //   92: aload #5
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   100: dup
/*     */     //   101: invokespecial <init> : ()V
/*     */     //   104: astore_3
/*     */     //   105: aload_3
/*     */     //   106: aload_1
/*     */     //   107: putfield element : Ljava/lang/Object;
/*     */     //   110: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */     //   113: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   116: astore #4
/*     */     //   118: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   121: invokevirtual getMATTERHORN_PROJECT_OPEN_FILES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   124: aload #4
/*     */     //   126: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   129: aload_3
/*     */     //   130: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */     //   135: aload #6
/*     */     //   137: aload #6
/*     */     //   139: aload_3
/*     */     //   140: putfield L$0 : Ljava/lang/Object;
/*     */     //   143: aload #6
/*     */     //   145: aload #4
/*     */     //   147: putfield L$1 : Ljava/lang/Object;
/*     */     //   150: aload #6
/*     */     //   152: iconst_1
/*     */     //   153: putfield label : I
/*     */     //   156: invokestatic setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   159: dup
/*     */     //   160: aload #7
/*     */     //   162: if_acmpne -> 194
/*     */     //   165: aload #7
/*     */     //   167: areturn
/*     */     //   168: aload #6
/*     */     //   170: getfield L$1 : Ljava/lang/Object;
/*     */     //   173: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService
/*     */     //   176: astore #4
/*     */     //   178: aload #6
/*     */     //   180: getfield L$0 : Ljava/lang/Object;
/*     */     //   183: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   186: astore_3
/*     */     //   187: aload #5
/*     */     //   189: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   192: aload #5
/*     */     //   194: pop
/*     */     //   195: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   198: invokevirtual getMATTERHORN_PROJECT_RECENT_FILES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   201: aload #4
/*     */     //   203: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   206: aload_3
/*     */     //   207: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */     //   212: aload #6
/*     */     //   214: aload #6
/*     */     //   216: aload_3
/*     */     //   217: putfield L$0 : Ljava/lang/Object;
/*     */     //   220: aload #6
/*     */     //   222: aconst_null
/*     */     //   223: putfield L$1 : Ljava/lang/Object;
/*     */     //   226: aload #6
/*     */     //   228: iconst_2
/*     */     //   229: putfield label : I
/*     */     //   232: invokestatic setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   235: dup
/*     */     //   236: aload #7
/*     */     //   238: if_acmpne -> 260
/*     */     //   241: aload #7
/*     */     //   243: areturn
/*     */     //   244: aload #6
/*     */     //   246: getfield L$0 : Ljava/lang/Object;
/*     */     //   249: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   252: astore_3
/*     */     //   253: aload #5
/*     */     //   255: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   258: aload #5
/*     */     //   260: pop
/*     */     //   261: aload_3
/*     */     //   262: getfield element : Ljava/lang/Object;
/*     */     //   265: areturn
/*     */     //   266: new java/lang/IllegalStateException
/*     */     //   269: dup
/*     */     //   270: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   272: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   275: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #79	-> 60
/*     */     //   #80	-> 97
/*     */     //   #81	-> 110
/*     */     //   #82	-> 118
/*     */     //   #79	-> 165
/*     */     //   #86	-> 194
/*     */     //   #79	-> 241
/*     */     //   #90	-> 260
/*     */     //   #79	-> 266
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	13	1	$this$setupFromEnvironment	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;
/*     */     //   105	63	3	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   187	57	3	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   253	13	3	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   118	50	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   178	57	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   0	276	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	216	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	209	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Unit setupFromEnvironment$lambda$1(Ref.ObjectRef $result, String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     $result.element = CommandLineStarterProjectState.copy$default((CommandLineStarterProjectState)$result.element, CommandLineStarterProjectState.Companion.parsePaths(it), null, 2, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit setupFromEnvironment$lambda$2(Ref.ObjectRef $result, String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     $result.element = CommandLineStarterProjectState.copy$default((CommandLineStarterProjectState)$result.element, null, CommandLineStarterProjectState.Companion.parsePaths(it), 1, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {82, 86}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"result", "propertyProvider", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarterProjectState$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandLineStarterProjectState$Companion$setupFromEnvironment$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     CommandLineStarterProjectState$Companion$setupFromEnvironment$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandLineStarterProjectState.Companion.this.setupFromEnvironment(null, (Continuation<? super CommandLineStarterProjectState>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CommandLineStarterProjectState$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */