/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\b\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002!\"B+\022\020\b\002\020\002\032\n\022\004\022\0020\004\030\0010\003\022\020\b\002\020\005\032\n\022\004\022\0020\004\030\0010\003¢\006\004\b\006\020\007B;\b\020\022\006\020\b\032\0020\t\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\004\030\0010\003\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\006\020\020\032\0020\021J\021\020\022\032\n\022\004\022\0020\004\030\0010\003HÆ\003J\021\020\023\032\n\022\004\022\0020\004\030\0010\003HÆ\003J-\020\024\032\0020\0002\020\b\002\020\002\032\n\022\004\022\0020\004\030\0010\0032\020\b\002\020\005\032\n\022\004\022\0020\004\030\0010\003HÆ\001J\023\020\025\032\0020\0212\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\tHÖ\001J\t\020\030\032\0020\004HÖ\001J%\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037H\001¢\006\002\b R\031\020\002\032\n\022\004\022\0020\004\030\0010\003¢\006\b\n\000\032\004\b\r\020\016R\031\020\005\032\n\022\004\022\0020\004\030\0010\003¢\006\b\n\000\032\004\b\017\020\016¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;", "", "openFiles", "", "", "recentFiles", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOpenFiles", "()Ljava/util/List;", "getRecentFiles", "isEmpty", "", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$matterhorn", "Companion", "$serializer", "matterhorn"})
/*     */ final class CommandLineStarterProjectState
/*     */ {
/*     */   public CommandLineStarterProjectState(@Nullable List<String> openFiles, @Nullable List<String> recentFiles) {
/*  68 */     this.openFiles = openFiles; this.recentFiles = recentFiles; } @Nullable public final List<String> getOpenFiles() { return this.openFiles; } @Nullable public final List<String> getRecentFiles() { return this.recentFiles; } public final boolean isEmpty() {
/*  69 */     return (this.openFiles == null && this.recentFiles == null);
/*     */   } @NotNull
/*  71 */   public static final Companion Companion = new Companion(null); @Nullable private final List<String> openFiles; @Nullable private final List<String> recentFiles; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull public static final String PATHS_SEPARATOR = ":"; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Nullable public final List<String> component1() { return this.openFiles; } @Nullable public final List<String> component2() { return this.recentFiles; } @NotNull public final CommandLineStarterProjectState copy(@Nullable List<String> openFiles, @Nullable List<String> recentFiles) { return new CommandLineStarterProjectState(openFiles, recentFiles); } @NotNull public String toString() { return "CommandLineStarterProjectState(openFiles=" + this.openFiles + ", recentFiles=" + this.recentFiles + ")"; } public int hashCode() { result = (this.openFiles == null) ? 0 : this.openFiles.hashCode(); return result * 31 + ((this.recentFiles == null) ? 0 : this.recentFiles.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof CommandLineStarterProjectState)) return false;  CommandLineStarterProjectState commandLineStarterProjectState = (CommandLineStarterProjectState)other; return !Intrinsics.areEqual(this.openFiles, commandLineStarterProjectState.openFiles) ? false : (!!Intrinsics.areEqual(this.recentFiles, commandLineStarterProjectState.recentFiles)); } public CommandLineStarterProjectState() { this((List)null, (List)null, 3, (DefaultConstructorMarker)null); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\006\032\b\022\004\022\0020\0050\0072\006\020\b\032\0020\005J\022\020\t\032\0020\n*\0020\nH@¢\006\002\020\013J\f\020\f\032\b\022\004\022\0020\n0\rR\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion;", "", "<init>", "()V", "PATHS_SEPARATOR", "", "parsePaths", "", "paths", "setupFromEnvironment", "Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;", "(Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "matterhorn"}) @SourceDebugExtension({"SMAP\nCommandLineStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,380:1\n1557#2:381\n1628#2,3:382\n*S KotlinDebug\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion\n*L\n76#1:381\n76#1:382,3\n*E\n"}) public static final class Companion { @NotNull public final KSerializer<CommandLineStarterProjectState> serializer() { return (KSerializer<CommandLineStarterProjectState>)CommandLineStarterProjectState.$serializer.INSTANCE; }
/*     */      private Companion() {}
/*     */     @NotNull
/*     */     public final List<String> parsePaths(@NotNull String paths) {
/*  75 */       Intrinsics.checkNotNullParameter(paths, "paths"); if (StringsKt.isBlank(paths)) return CollectionsKt.emptyList(); 
/*  76 */       String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; Iterable $this$map$iv = StringsKt.split$default(StringsKt.trim(paths).toString(), arrayOfString, false, 0, 6, null); int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 381 */       Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 382 */       for (Object item$iv$iv : iterable1) {
/* 383 */         String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-CommandLineStarterProjectState$Companion$parsePaths$1 = 0; collection.add(StringsKt.trim(str).toString());
/* 384 */       }  return (List<String>)destination$iv$iv;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object setupFromEnvironment(@NotNull CommandLineStarterProjectState $this$setupFromEnvironment, @NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion$setupFromEnvironment$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion$setupFromEnvironment$1
/*     */       //   11: astore #6
/*     */       //   13: aload #6
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #6
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion$setupFromEnvironment$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #6
/*     */       //   50: aload #6
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #5
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #7
/*     */       //   62: aload #6
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 266, 0 -> 92, 1 -> 168, 2 -> 244
/*     */       //   92: aload #5
/*     */       //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   97: new kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   100: dup
/*     */       //   101: invokespecial <init> : ()V
/*     */       //   104: astore_3
/*     */       //   105: aload_3
/*     */       //   106: aload_1
/*     */       //   107: putfield element : Ljava/lang/Object;
/*     */       //   110: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */       //   113: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */       //   116: astore #4
/*     */       //   118: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */       //   121: invokevirtual getMATTERHORN_PROJECT_OPEN_FILES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   124: aload #4
/*     */       //   126: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   129: aload_3
/*     */       //   130: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   135: aload #6
/*     */       //   137: aload #6
/*     */       //   139: aload_3
/*     */       //   140: putfield L$0 : Ljava/lang/Object;
/*     */       //   143: aload #6
/*     */       //   145: aload #4
/*     */       //   147: putfield L$1 : Ljava/lang/Object;
/*     */       //   150: aload #6
/*     */       //   152: iconst_1
/*     */       //   153: putfield label : I
/*     */       //   156: invokestatic setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   159: dup
/*     */       //   160: aload #7
/*     */       //   162: if_acmpne -> 194
/*     */       //   165: aload #7
/*     */       //   167: areturn
/*     */       //   168: aload #6
/*     */       //   170: getfield L$1 : Ljava/lang/Object;
/*     */       //   173: checkcast com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService
/*     */       //   176: astore #4
/*     */       //   178: aload #6
/*     */       //   180: getfield L$0 : Ljava/lang/Object;
/*     */       //   183: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   186: astore_3
/*     */       //   187: aload #5
/*     */       //   189: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   192: aload #5
/*     */       //   194: pop
/*     */       //   195: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */       //   198: invokevirtual getMATTERHORN_PROJECT_RECENT_FILES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   201: aload #4
/*     */       //   203: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   206: aload_3
/*     */       //   207: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   212: aload #6
/*     */       //   214: aload #6
/*     */       //   216: aload_3
/*     */       //   217: putfield L$0 : Ljava/lang/Object;
/*     */       //   220: aload #6
/*     */       //   222: aconst_null
/*     */       //   223: putfield L$1 : Ljava/lang/Object;
/*     */       //   226: aload #6
/*     */       //   228: iconst_2
/*     */       //   229: putfield label : I
/*     */       //   232: invokestatic setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   235: dup
/*     */       //   236: aload #7
/*     */       //   238: if_acmpne -> 260
/*     */       //   241: aload #7
/*     */       //   243: areturn
/*     */       //   244: aload #6
/*     */       //   246: getfield L$0 : Ljava/lang/Object;
/*     */       //   249: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   252: astore_3
/*     */       //   253: aload #5
/*     */       //   255: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   258: aload #5
/*     */       //   260: pop
/*     */       //   261: aload_3
/*     */       //   262: getfield element : Ljava/lang/Object;
/*     */       //   265: areturn
/*     */       //   266: new java/lang/IllegalStateException
/*     */       //   269: dup
/*     */       //   270: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   272: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   275: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #79	-> 60
/*     */       //   #80	-> 97
/*     */       //   #81	-> 110
/*     */       //   #82	-> 118
/*     */       //   #79	-> 165
/*     */       //   #86	-> 194
/*     */       //   #79	-> 241
/*     */       //   #90	-> 260
/*     */       //   #79	-> 266
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   97	13	1	$this$setupFromEnvironment	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;
/*     */       //   105	63	3	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   187	57	3	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   253	13	3	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   118	50	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */       //   178	57	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */       //   0	276	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	216	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	209	5	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     private static final Unit setupFromEnvironment$lambda$1(Ref.ObjectRef $result, String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       $result.element = CommandLineStarterProjectState.copy$default((CommandLineStarterProjectState)$result.element, CommandLineStarterProjectState.Companion.parsePaths(it), null, 2, null);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit setupFromEnvironment$lambda$2(Ref.ObjectRef $result, String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       $result.element = CommandLineStarterProjectState.copy$default((CommandLineStarterProjectState)$result.element, null, CommandLineStarterProjectState.Companion.parsePaths(it), 1, null);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "CommandLineStarter.kt", l = {82, 86}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"result", "propertyProvider", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarterProjectState$Companion")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class CommandLineStarterProjectState$Companion$setupFromEnvironment$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       CommandLineStarterProjectState$Companion$setupFromEnvironment$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return CommandLineStarterProjectState.Companion.this.setupFromEnvironment(null, (Continuation<? super CommandLineStarterProjectState>)this);
/*     */       }
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CommandLineStarterProjectState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */