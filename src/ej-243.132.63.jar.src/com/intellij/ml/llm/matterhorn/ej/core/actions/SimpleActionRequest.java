/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\b\n\002\020$\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 %2\0020\001:\002%&B)\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\b\b\002\020\006\032\0020\007¢\006\004\b\b\020\tBA\b\020\022\006\020\n\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\006\020\006\032\0020\007\022\b\020\013\032\004\030\0010\f¢\006\004\b\b\020\rJ\"\020\024\032\016\022\004\022\0020\003\022\004\022\0020\0260\0252\006\020\027\032\0020\030H@¢\006\002\020\031J\b\020\034\032\0020\003H\026J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\020\020\017R\024\020\005\032\0020\003X\004¢\006\b\n\000\032\004\b\021\020\017R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\032\032\0020\0038VX\004¢\006\006\032\004\b\033\020\017¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "name", "", "arguments", "description", "numCommands", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getArguments", "getDescription", "getNumCommands", "()I", "getInputParameters", "", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "action", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "title", "getTitle", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "Companion", "$serializer", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nActionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionRequest.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1577#2,11:163\n1872#2,2:174\n1874#2:177\n1588#2:178\n1#3:176\n*S KotlinDebug\n*F\n+ 1 ActionRequest.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest\n*L\n61#1:163,11\n61#1:174,2\n61#1:177\n61#1:178\n61#1:176\n*E\n"})
/*     */ public final class SimpleActionRequest
/*     */   implements ActionRequest
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final String arguments;
/*     */   @NotNull
/*     */   private final String description;
/*     */   private final int numCommands;
/*     */   
/*     */   public SimpleActionRequest(@NotNull String name, @NotNull String arguments, @NotNull String description, int numCommands) {
/*  53 */     this.name = name;
/*  54 */     this.arguments = arguments;
/*  55 */     this.description = description;
/*  56 */     this.numCommands = numCommands; } @NotNull public String getName() { return this.name; } public int getNumCommands() { return this.numCommands; }
/*     */   @NotNull public final String getArguments() { return this.arguments; }
/*     */   @NotNull
/*     */   public String getDescription() { return this.description; } @Nullable
/*  60 */   public Object getInputParameters(@NotNull AgentAction action, @NotNull Continuation $completion) { List<String> args = AgentUtilsKt.parseArgs(this.arguments);
/*  61 */     Iterable $this$mapIndexedNotNull$iv = action.getArguments(); int $i$f$mapIndexedNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     Iterable iterable1 = $this$mapIndexedNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapIndexedNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 173 */     Iterable $this$forEachIndexed$iv$iv$iv = iterable1; int $i$f$forEachIndexed = 0;
/* 174 */     int index$iv$iv$iv = 0;
/* 175 */     Iterator iterator = $this$forEachIndexed$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object item$iv$iv$iv = iterator.next(); int i = index$iv$iv$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  Object object1 = item$iv$iv$iv; int index$iv$iv = i, $i$a$-forEachIndexed-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$iv$iv = 0; Argument argument = (Argument)object1;
/*     */       int index = index$iv$iv, $i$a$-mapIndexedNotNull-SimpleActionRequest$getInputParameters$2 = 0; }
/*     */     
/* 178 */     return MapsKt.toMap(destination$iv$iv); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String getTitle() {
/*     */     return getName() + " " + getName();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "## " + getName() + " " + this.arguments + "\n\n" + getDescription() + "\n";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\030\020\b\032\0020\0072\006\020\006\032\0020\0072\006\020\t\032\0020\007H\002J\f\020\n\032\b\022\004\022\0020\0050\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;", "", "<init>", "()V", "parse", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;", "description", "", "createParseErrorMessage", "errorMessage", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nActionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionRequest.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,162:1\n158#2,6:163\n*S KotlinDebug\n*F\n+ 1 ActionRequest.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion\n*L\n96#1:163,6\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<SimpleActionRequest> serializer() {
/*     */       return (KSerializer<SimpleActionRequest>)SimpleActionRequest.$serializer.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SimpleActionRequest parse(@NotNull String description) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'description'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: new kotlin/text/Regex
/*     */       //   9: dup
/*     */       //   10: ldc '<COMMAND(\d{0,2})>(.*?)</COMMAND\1>'
/*     */       //   12: getstatic kotlin/text/RegexOption.DOT_MATCHES_ALL : Lkotlin/text/RegexOption;
/*     */       //   15: invokespecial <init> : (Ljava/lang/String;Lkotlin/text/RegexOption;)V
/*     */       //   18: astore_2
/*     */       //   19: aload_2
/*     */       //   20: aload_1
/*     */       //   21: checkcast java/lang/CharSequence
/*     */       //   24: iconst_0
/*     */       //   25: iconst_2
/*     */       //   26: aconst_null
/*     */       //   27: invokestatic findAll$default : (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/sequences/Sequence;
/*     */       //   30: invokestatic toList : (Lkotlin/sequences/Sequence;)Ljava/util/List;
/*     */       //   33: astore_3
/*     */       //   34: aload_3
/*     */       //   35: invokeinterface size : ()I
/*     */       //   40: istore #4
/*     */       //   42: aload_3
/*     */       //   43: invokeinterface size : ()I
/*     */       //   48: iconst_1
/*     */       //   49: if_icmple -> 61
/*     */       //   52: aload_3
/*     */       //   53: checkcast java/lang/Iterable
/*     */       //   56: iconst_1
/*     */       //   57: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */       //   60: astore_3
/*     */       //   61: nop
/*     */       //   62: aconst_null
/*     */       //   63: astore #5
/*     */       //   65: aload_3
/*     */       //   66: checkcast java/util/Collection
/*     */       //   69: invokeinterface isEmpty : ()Z
/*     */       //   74: ifne -> 81
/*     */       //   77: iconst_1
/*     */       //   78: goto -> 82
/*     */       //   81: iconst_0
/*     */       //   82: ifeq -> 163
/*     */       //   85: aload_3
/*     */       //   86: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   89: checkcast kotlin/text/MatchResult
/*     */       //   92: invokeinterface getGroups : ()Lkotlin/text/MatchGroupCollection;
/*     */       //   97: iconst_2
/*     */       //   98: invokeinterface get : (I)Lkotlin/text/MatchGroup;
/*     */       //   103: dup
/*     */       //   104: ifnull -> 127
/*     */       //   107: invokevirtual getValue : ()Ljava/lang/String;
/*     */       //   110: dup
/*     */       //   111: ifnull -> 127
/*     */       //   114: checkcast java/lang/CharSequence
/*     */       //   117: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   120: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   123: dup
/*     */       //   124: ifnonnull -> 130
/*     */       //   127: pop
/*     */       //   128: ldc ''
/*     */       //   130: astore #5
/*     */       //   132: aload #5
/*     */       //   134: checkcast java/lang/CharSequence
/*     */       //   137: invokeinterface length : ()I
/*     */       //   142: ifne -> 149
/*     */       //   145: iconst_1
/*     */       //   146: goto -> 150
/*     */       //   149: iconst_0
/*     */       //   150: ifeq -> 173
/*     */       //   153: new com/intellij/ml/llm/matterhorn/InvalidContentFormatException
/*     */       //   156: dup
/*     */       //   157: ldc 'Failed to parse action'
/*     */       //   159: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   162: athrow
/*     */       //   163: new com/intellij/ml/llm/matterhorn/InvalidContentFormatException
/*     */       //   166: dup
/*     */       //   167: ldc 'Failed to locate command block'
/*     */       //   169: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   172: athrow
/*     */       //   173: aload_1
/*     */       //   174: astore #7
/*     */       //   176: aload_3
/*     */       //   177: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   180: checkcast kotlin/text/MatchResult
/*     */       //   183: invokeinterface getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   188: astore #8
/*     */       //   190: aload #7
/*     */       //   192: checkcast java/lang/CharSequence
/*     */       //   195: aload #8
/*     */       //   197: invokestatic removeRange : (Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/CharSequence;
/*     */       //   200: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   203: checkcast java/lang/CharSequence
/*     */       //   206: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   209: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   212: astore #6
/*     */       //   214: aload #5
/*     */       //   216: checkcast java/lang/CharSequence
/*     */       //   219: astore #8
/*     */       //   221: iconst_0
/*     */       //   222: istore #9
/*     */       //   224: iconst_0
/*     */       //   225: istore #10
/*     */       //   227: aload #8
/*     */       //   229: invokeinterface length : ()I
/*     */       //   234: istore #11
/*     */       //   236: iload #10
/*     */       //   238: iload #11
/*     */       //   240: if_icmpge -> 276
/*     */       //   243: aload #8
/*     */       //   245: iload #10
/*     */       //   247: invokeinterface charAt : (I)C
/*     */       //   252: istore #12
/*     */       //   254: iconst_0
/*     */       //   255: istore #13
/*     */       //   257: iload #12
/*     */       //   259: invokestatic isWhitespace : (C)Z
/*     */       //   262: ifeq -> 270
/*     */       //   265: iload #10
/*     */       //   267: goto -> 277
/*     */       //   270: iinc #10, 1
/*     */       //   273: goto -> 236
/*     */       //   276: iconst_m1
/*     */       //   277: istore #7
/*     */       //   279: aconst_null
/*     */       //   280: astore #8
/*     */       //   282: aconst_null
/*     */       //   283: astore #9
/*     */       //   285: aconst_null
/*     */       //   286: astore #10
/*     */       //   288: iload #7
/*     */       //   290: iflt -> 357
/*     */       //   293: aload #5
/*     */       //   295: iconst_0
/*     */       //   296: iload #7
/*     */       //   298: invokevirtual substring : (II)Ljava/lang/String;
/*     */       //   301: dup
/*     */       //   302: ldc 'substring(...)'
/*     */       //   304: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   307: checkcast java/lang/CharSequence
/*     */       //   310: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   313: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   316: astore #8
/*     */       //   318: aload #5
/*     */       //   320: iload #7
/*     */       //   322: iconst_1
/*     */       //   323: iadd
/*     */       //   324: invokevirtual substring : (I)Ljava/lang/String;
/*     */       //   327: dup
/*     */       //   328: ldc 'substring(...)'
/*     */       //   330: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   333: astore #9
/*     */       //   335: aload #5
/*     */       //   337: iload #7
/*     */       //   339: iload #7
/*     */       //   341: iconst_1
/*     */       //   342: iadd
/*     */       //   343: invokevirtual substring : (II)Ljava/lang/String;
/*     */       //   346: dup
/*     */       //   347: ldc 'substring(...)'
/*     */       //   349: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   352: astore #10
/*     */       //   354: goto -> 378
/*     */       //   357: aload #5
/*     */       //   359: checkcast java/lang/CharSequence
/*     */       //   362: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   365: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   368: astore #8
/*     */       //   370: ldc ''
/*     */       //   372: astore #9
/*     */       //   374: ldc ''
/*     */       //   376: astore #10
/*     */       //   378: aload #8
/*     */       //   380: checkcast java/lang/CharSequence
/*     */       //   383: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   386: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   389: ldc '#'
/*     */       //   391: iconst_0
/*     */       //   392: iconst_2
/*     */       //   393: aconst_null
/*     */       //   394: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   397: ifeq -> 415
/*     */       //   400: new com/intellij/ml/llm/matterhorn/InvalidContentFormatException
/*     */       //   403: dup
/*     */       //   404: aload #5
/*     */       //   406: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   411: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   414: athrow
/*     */       //   415: aload #10
/*     */       //   417: aload #9
/*     */       //   419: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   424: checkcast java/lang/CharSequence
/*     */       //   427: bipush #10
/*     */       //   429: iconst_0
/*     */       //   430: iconst_2
/*     */       //   431: aconst_null
/*     */       //   432: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */       //   435: ifeq -> 522
/*     */       //   438: bipush #7
/*     */       //   440: anewarray java/lang/String
/*     */       //   443: astore #11
/*     */       //   445: aload #11
/*     */       //   447: iconst_0
/*     */       //   448: ldc 'replace_lines'
/*     */       //   450: aastore
/*     */       //   451: aload #11
/*     */       //   453: iconst_1
/*     */       //   454: ldc 'rewrite_file'
/*     */       //   456: aastore
/*     */       //   457: aload #11
/*     */       //   459: iconst_2
/*     */       //   460: ldc 'create'
/*     */       //   462: aastore
/*     */       //   463: aload #11
/*     */       //   465: iconst_3
/*     */       //   466: ldc 'search_replace'
/*     */       //   468: aastore
/*     */       //   469: aload #11
/*     */       //   471: iconst_4
/*     */       //   472: ldc 'call_expert'
/*     */       //   474: aastore
/*     */       //   475: aload #11
/*     */       //   477: iconst_5
/*     */       //   478: ldc 'answer'
/*     */       //   480: aastore
/*     */       //   481: aload #11
/*     */       //   483: bipush #6
/*     */       //   485: ldc 'cd'
/*     */       //   487: aastore
/*     */       //   488: aload #11
/*     */       //   490: invokestatic setOf : ([Ljava/lang/Object;)Ljava/util/Set;
/*     */       //   493: aload #8
/*     */       //   495: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   500: ifne -> 522
/*     */       //   503: aload #9
/*     */       //   505: checkcast java/lang/CharSequence
/*     */       //   508: ldc '&&'
/*     */       //   510: checkcast java/lang/CharSequence
/*     */       //   513: iconst_0
/*     */       //   514: iconst_2
/*     */       //   515: aconst_null
/*     */       //   516: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */       //   519: ifeq -> 546
/*     */       //   522: aload #8
/*     */       //   524: checkcast java/lang/CharSequence
/*     */       //   527: astore #11
/*     */       //   529: new kotlin/text/Regex
/*     */       //   532: dup
/*     */       //   533: ldc '\s'
/*     */       //   535: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   538: aload #11
/*     */       //   540: invokevirtual containsMatchIn : (Ljava/lang/CharSequence;)Z
/*     */       //   543: ifeq -> 598
/*     */       //   546: aload #5
/*     */       //   548: checkcast java/lang/CharSequence
/*     */       //   551: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   554: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   557: ldc '```'
/*     */       //   559: iconst_0
/*     */       //   560: iconst_2
/*     */       //   561: aconst_null
/*     */       //   562: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   565: ifeq -> 583
/*     */       //   568: new com/intellij/ml/llm/matterhorn/InvalidContentFormatException
/*     */       //   571: dup
/*     */       //   572: aload #5
/*     */       //   574: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   579: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   582: athrow
/*     */       //   583: new com/intellij/ml/llm/matterhorn/InvalidContentFormatException
/*     */       //   586: dup
/*     */       //   587: aload #5
/*     */       //   589: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   594: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   597: athrow
/*     */       //   598: new com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */       //   601: dup
/*     */       //   602: aload #8
/*     */       //   604: aload #9
/*     */       //   606: aload #6
/*     */       //   608: iload #4
/*     */       //   610: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
/*     */       //   613: areturn
/*     */       //   614: astore #6
/*     */       //   616: new com/intellij/ml/llm/matterhorn/InvalidContentFormatException
/*     */       //   619: dup
/*     */       //   620: aload_0
/*     */       //   621: aload_1
/*     */       //   622: aload #6
/*     */       //   624: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   627: dup
/*     */       //   628: ifnonnull -> 637
/*     */       //   631: pop
/*     */       //   632: aload #6
/*     */       //   634: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   637: invokespecial createParseErrorMessage : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   640: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   643: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #78	-> 6
/*     */       //   #79	-> 19
/*     */       //   #80	-> 34
/*     */       //   #81	-> 42
/*     */       //   #82	-> 52
/*     */       //   #84	-> 61
/*     */       //   #85	-> 62
/*     */       //   #86	-> 65
/*     */       //   #86	-> 82
/*     */       //   #87	-> 85
/*     */       //   #87	-> 123
/*     */       //   #88	-> 132
/*     */       //   #88	-> 150
/*     */       //   #89	-> 153
/*     */       //   #92	-> 163
/*     */       //   #95	-> 173
/*     */       //   #95	-> 203
/*     */       //   #95	-> 212
/*     */       //   #96	-> 214
/*     */       //   #163	-> 224
/*     */       //   #164	-> 243
/*     */       //   #96	-> 257
/*     */       //   #164	-> 262
/*     */       //   #165	-> 265
/*     */       //   #163	-> 270
/*     */       //   #168	-> 276
/*     */       //   #96	-> 277
/*     */       //   #97	-> 279
/*     */       //   #98	-> 282
/*     */       //   #99	-> 285
/*     */       //   #100	-> 288
/*     */       //   #101	-> 293
/*     */       //   #101	-> 293
/*     */       //   #101	-> 316
/*     */       //   #102	-> 318
/*     */       //   #102	-> 333
/*     */       //   #103	-> 335
/*     */       //   #103	-> 352
/*     */       //   #105	-> 357
/*     */       //   #105	-> 368
/*     */       //   #106	-> 370
/*     */       //   #107	-> 374
/*     */       //   #109	-> 378
/*     */       //   #109	-> 389
/*     */       //   #110	-> 400
/*     */       //   #112	-> 415
/*     */       //   #113	-> 438
/*     */       //   #114	-> 454
/*     */       //   #113	-> 457
/*     */       //   #115	-> 460
/*     */       //   #113	-> 463
/*     */       //   #116	-> 466
/*     */       //   #113	-> 469
/*     */       //   #117	-> 472
/*     */       //   #113	-> 475
/*     */       //   #118	-> 478
/*     */       //   #113	-> 481
/*     */       //   #119	-> 485
/*     */       //   #113	-> 488
/*     */       //   #112	-> 490
/*     */       //   #121	-> 503
/*     */       //   #122	-> 522
/*     */       //   #122	-> 543
/*     */       //   #123	-> 546
/*     */       //   #123	-> 557
/*     */       //   #124	-> 568
/*     */       //   #126	-> 583
/*     */       //   #128	-> 598
/*     */       //   #129	-> 602
/*     */       //   #130	-> 604
/*     */       //   #131	-> 606
/*     */       //   #132	-> 608
/*     */       //   #128	-> 610
/*     */       //   #135	-> 614
/*     */       //   #136	-> 616
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   257	5	13	$i$a$-indexOfFirst-SimpleActionRequest$Companion$parse$actionWhitespaceIdx$1	I
/*     */       //   254	8	12	it	C
/*     */       //   227	49	10	index$iv	I
/*     */       //   224	53	9	$i$f$indexOfFirst	I
/*     */       //   221	56	8	$this$indexOfFirst$iv	Ljava/lang/CharSequence;
/*     */       //   65	549	5	actionString	Ljava/lang/String;
/*     */       //   214	400	6	descriptionString	Ljava/lang/String;
/*     */       //   279	335	7	actionWhitespaceIdx	I
/*     */       //   282	332	8	actionName	Ljava/lang/String;
/*     */       //   285	329	9	actionArguments	Ljava/lang/String;
/*     */       //   288	326	10	whitespaceBeforeArgs	Ljava/lang/String;
/*     */       //   616	28	6	e	Ljava/lang/Exception;
/*     */       //   19	625	2	actionRegex	Lkotlin/text/Regex;
/*     */       //   34	610	3	actionMatch	Ljava/util/List;
/*     */       //   42	602	4	numCommands	I
/*     */       //   0	644	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*     */       //   0	644	1	description	Ljava/lang/String;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   61	614	614	java/lang/Exception
/*     */     }
/*     */     
/*     */     private final String createParseErrorMessage(String description, String errorMessage) {
/*     */       return StringsKt.trimIndent("ERROR: Failed to locate command block\n\nDetails:\nCan't parse a command:\n````\n" + description + "\n````\n" + errorMessage + "\n\nYour output was not formatted correctly. You must always include one `<THOUGHT>` and one `<COMMAND>` blocks as part of your response. Make sure you do not have multiple THOUGHT/COMMAND.\nPlease make sure your output precisely matches the following format:\n\n<THOUGHT>\nDiscuss here with yourself about what your planning and what you're going to do in this step.\n</THOUGHT>\n<COMMAND>\ncommand that you're going to run\n</COMMAND>\n");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SimpleActionRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */