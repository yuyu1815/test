/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020!\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 ,2\0020\001:\002+,B\037\022\006\020\002\032\0020\003\022\016\b\002\020\004\032\b\022\004\022\0020\0010\005¢\006\004\b\006\020\007B5\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\001\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\016\020\021\032\0020\0002\006\020\002\032\0020\003J\016\020\022\032\0020\0232\006\020\002\032\0020\003J\020\020\024\032\0020\0252\006\020\026\032\0020\003H\002J\020\020\027\032\004\030\0010\0012\006\020\002\032\0020\003J\020\020\030\032\004\030\0010\0012\006\020\026\032\0020\003J\016\020\031\032\0020\0232\006\020\026\032\0020\003J\020\020\032\032\0020\0252\006\020\026\032\0020\003H\002J\026\020\033\032\0020\0232\006\020\026\032\0020\0032\006\020\034\032\0020\003J\036\020\035\032\0020\0252\006\020\026\032\0020\0032\006\020\036\032\0020\0032\006\020\037\032\0020\003J\016\020 \032\0020!2\006\020\026\032\0020\003J\b\020\"\032\0020\003H\026J%\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)H\001¢\006\002\b*R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\016R\027\020\004\032\b\022\004\022\0020\0010\005¢\006\b\n\000\032\004\b\017\020\020¨\006-"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "name", "", "children", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getChildren", "()Ljava/util/List;", "getOrCreateChildFolder", "getOrCreateChildFile", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFile;", "getOrCreateChildBinaryFile", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile;", "filePath", "getChild", "findChild", "findOrCreateFile", "findOrCreateBinaryFile", "updateOrCreateFile", "content", "updateOrCreateBinaryFile", "mediaContentId", "description", "removeChild", "", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectFileStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectFileStructure.kt\ncom/intellij/ml/llm/matterhorn/ProjectStructureFolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,524:1\n1#2:525\n*E\n"})
/*     */ public final class ProjectStructureFolder implements ProjectStructureItem {
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final List<ProjectStructureItem> children;
/*     */   @NotNull
/*  31 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)new ProjectStructureItemSerializer()); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ProjectStructureFolder> serializer() { return (KSerializer<ProjectStructureFolder>)ProjectStructureFolder.$serializer.INSTANCE; } }
/*  32 */   public ProjectStructureFolder(@NotNull String name, @NotNull List<ProjectStructureItem> children) { this.name = name; this.children = children; } @NotNull public String getName() { return this.name; } @NotNull public final List<ProjectStructureItem> getChildren() { return this.children; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ProjectStructureFolder getOrCreateChildFolder(@NotNull String name) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'name'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc '.'
/*     */     //   9: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   12: ifeq -> 17
/*     */     //   15: aload_0
/*     */     //   16: areturn
/*     */     //   17: aload_0
/*     */     //   18: getfield children : Ljava/util/List;
/*     */     //   21: checkcast java/lang/Iterable
/*     */     //   24: astore #4
/*     */     //   26: aload #4
/*     */     //   28: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   33: astore #5
/*     */     //   35: aload #5
/*     */     //   37: invokeinterface hasNext : ()Z
/*     */     //   42: ifeq -> 83
/*     */     //   45: aload #5
/*     */     //   47: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   52: astore #6
/*     */     //   54: aload #6
/*     */     //   56: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   59: astore #7
/*     */     //   61: iconst_0
/*     */     //   62: istore #8
/*     */     //   64: aload #7
/*     */     //   66: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   71: aload_1
/*     */     //   72: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   75: ifeq -> 35
/*     */     //   78: aload #6
/*     */     //   80: goto -> 84
/*     */     //   83: aconst_null
/*     */     //   84: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   87: astore_2
/*     */     //   88: aload_2
/*     */     //   89: instanceof com/intellij/ml/llm/matterhorn/ProjectStructureFolder
/*     */     //   92: ifeq -> 100
/*     */     //   95: aload_2
/*     */     //   96: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureFolder
/*     */     //   99: areturn
/*     */     //   100: new com/intellij/ml/llm/matterhorn/ProjectStructureFolder
/*     */     //   103: dup
/*     */     //   104: aload_1
/*     */     //   105: new java/util/ArrayList
/*     */     //   108: dup
/*     */     //   109: invokespecial <init> : ()V
/*     */     //   112: checkcast java/util/List
/*     */     //   115: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;)V
/*     */     //   118: astore_3
/*     */     //   119: aload_3
/*     */     //   120: astore #4
/*     */     //   122: iconst_0
/*     */     //   123: istore #5
/*     */     //   125: aload_0
/*     */     //   126: getfield children : Ljava/util/List;
/*     */     //   129: aload #4
/*     */     //   131: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   136: pop
/*     */     //   137: nop
/*     */     //   138: aload_3
/*     */     //   139: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 6
/*     */     //   #37	-> 15
/*     */     //   #39	-> 17
/*     */     //   #525	-> 61
/*     */     //   #39	-> 64
/*     */     //   #39	-> 75
/*     */     //   #39	-> 84
/*     */     //   #40	-> 88
/*     */     //   #41	-> 95
/*     */     //   #43	-> 100
/*     */     //   #43	-> 115
/*     */     //   #44	-> 125
/*     */     //   #45	-> 137
/*     */     //   #43	-> 138
/*     */     //   #43	-> 139
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   64	11	8	$i$a$-find-ProjectStructureFolder$getOrCreateChildFolder$current$1	I
/*     */     //   61	14	7	it	Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   125	13	5	$i$a$-also-ProjectStructureFolder$getOrCreateChildFolder$1	I
/*     */     //   122	16	4	it	Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;
/*     */     //   88	52	2	current	Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   0	140	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;
/*     */     //   0	140	1	name	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ProjectStructureFile getOrCreateChildFile(@NotNull String name) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'name'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield children : Ljava/util/List;
/*     */     //   10: checkcast java/lang/Iterable
/*     */     //   13: astore #4
/*     */     //   15: aload #4
/*     */     //   17: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   22: astore #5
/*     */     //   24: aload #5
/*     */     //   26: invokeinterface hasNext : ()Z
/*     */     //   31: ifeq -> 72
/*     */     //   34: aload #5
/*     */     //   36: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   41: astore #6
/*     */     //   43: aload #6
/*     */     //   45: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   48: astore #7
/*     */     //   50: iconst_0
/*     */     //   51: istore #8
/*     */     //   53: aload #7
/*     */     //   55: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   60: aload_1
/*     */     //   61: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   64: ifeq -> 24
/*     */     //   67: aload #6
/*     */     //   69: goto -> 73
/*     */     //   72: aconst_null
/*     */     //   73: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   76: astore_2
/*     */     //   77: aload_2
/*     */     //   78: instanceof com/intellij/ml/llm/matterhorn/ProjectStructureFile
/*     */     //   81: ifeq -> 89
/*     */     //   84: aload_2
/*     */     //   85: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureFile
/*     */     //   88: areturn
/*     */     //   89: new com/intellij/ml/llm/matterhorn/ProjectStructureFile
/*     */     //   92: dup
/*     */     //   93: aload_1
/*     */     //   94: ldc ''
/*     */     //   96: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   99: astore_3
/*     */     //   100: aload_3
/*     */     //   101: astore #4
/*     */     //   103: iconst_0
/*     */     //   104: istore #5
/*     */     //   106: aload_0
/*     */     //   107: getfield children : Ljava/util/List;
/*     */     //   110: aload #4
/*     */     //   112: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   117: pop
/*     */     //   118: nop
/*     */     //   119: aload_3
/*     */     //   120: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 6
/*     */     //   #525	-> 50
/*     */     //   #49	-> 53
/*     */     //   #49	-> 64
/*     */     //   #49	-> 73
/*     */     //   #50	-> 77
/*     */     //   #51	-> 84
/*     */     //   #53	-> 89
/*     */     //   #54	-> 106
/*     */     //   #55	-> 118
/*     */     //   #53	-> 119
/*     */     //   #53	-> 120
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   53	11	8	$i$a$-find-ProjectStructureFolder$getOrCreateChildFile$current$1	I
/*     */     //   50	14	7	it	Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   106	13	5	$i$a$-also-ProjectStructureFolder$getOrCreateChildFile$1	I
/*     */     //   103	16	4	it	Lcom/intellij/ml/llm/matterhorn/ProjectStructureFile;
/*     */     //   77	44	2	current	Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   0	121	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;
/*     */     //   0	121	1	name	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final ProjectStructureBinaryFile getOrCreateChildBinaryFile(String filePath) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield children : Ljava/util/List;
/*     */     //   4: checkcast java/lang/Iterable
/*     */     //   7: astore #4
/*     */     //   9: aload #4
/*     */     //   11: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   16: astore #5
/*     */     //   18: aload #5
/*     */     //   20: invokeinterface hasNext : ()Z
/*     */     //   25: ifeq -> 69
/*     */     //   28: aload #5
/*     */     //   30: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   35: astore #6
/*     */     //   37: aload #6
/*     */     //   39: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   42: astore #7
/*     */     //   44: iconst_0
/*     */     //   45: istore #8
/*     */     //   47: aload #7
/*     */     //   49: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   54: aload_0
/*     */     //   55: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   58: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   61: ifeq -> 18
/*     */     //   64: aload #6
/*     */     //   66: goto -> 70
/*     */     //   69: aconst_null
/*     */     //   70: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   73: astore_2
/*     */     //   74: aload_2
/*     */     //   75: instanceof com/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile
/*     */     //   78: ifeq -> 86
/*     */     //   81: aload_2
/*     */     //   82: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile
/*     */     //   85: areturn
/*     */     //   86: aload_1
/*     */     //   87: iconst_1
/*     */     //   88: newarray char
/*     */     //   90: astore #4
/*     */     //   92: aload #4
/*     */     //   94: iconst_0
/*     */     //   95: bipush #47
/*     */     //   97: castore
/*     */     //   98: aload #4
/*     */     //   100: invokestatic trimStart : (Ljava/lang/String;[C)Ljava/lang/String;
/*     */     //   103: checkcast java/lang/CharSequence
/*     */     //   106: iconst_1
/*     */     //   107: anewarray java/lang/String
/*     */     //   110: astore #4
/*     */     //   112: aload #4
/*     */     //   114: iconst_0
/*     */     //   115: ldc '/'
/*     */     //   117: aastore
/*     */     //   118: aload #4
/*     */     //   120: iconst_0
/*     */     //   121: iconst_0
/*     */     //   122: bipush #6
/*     */     //   124: aconst_null
/*     */     //   125: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   128: checkcast java/lang/Iterable
/*     */     //   131: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   134: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   137: checkcast java/lang/String
/*     */     //   140: astore_3
/*     */     //   141: new com/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile
/*     */     //   144: dup
/*     */     //   145: aload_3
/*     */     //   146: aconst_null
/*     */     //   147: aconst_null
/*     */     //   148: iconst_4
/*     */     //   149: aconst_null
/*     */     //   150: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   153: astore #4
/*     */     //   155: aload #4
/*     */     //   157: astore #5
/*     */     //   159: iconst_0
/*     */     //   160: istore #6
/*     */     //   162: aload_0
/*     */     //   163: getfield children : Ljava/util/List;
/*     */     //   166: aload #5
/*     */     //   168: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   173: pop
/*     */     //   174: nop
/*     */     //   175: aload #4
/*     */     //   177: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 0
/*     */     //   #525	-> 44
/*     */     //   #60	-> 47
/*     */     //   #60	-> 61
/*     */     //   #60	-> 70
/*     */     //   #61	-> 74
/*     */     //   #62	-> 81
/*     */     //   #64	-> 86
/*     */     //   #65	-> 141
/*     */     //   #66	-> 162
/*     */     //   #67	-> 174
/*     */     //   #65	-> 175
/*     */     //   #65	-> 177
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	14	8	$i$a$-find-ProjectStructureFolder$getOrCreateChildBinaryFile$current$1	I
/*     */     //   44	17	7	it	Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   162	13	6	$i$a$-also-ProjectStructureFolder$getOrCreateChildBinaryFile$1	I
/*     */     //   159	16	5	it	Lcom/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile;
/*     */     //   141	37	3	fileName	Ljava/lang/String;
/*     */     //   74	104	2	current	Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   0	178	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;
/*     */     //   0	178	1	filePath	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final ProjectStructureItem getChild(@NotNull String name) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'name'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc '.'
/*     */     //   9: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   12: ifeq -> 20
/*     */     //   15: aload_0
/*     */     //   16: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   19: areturn
/*     */     //   20: aload_0
/*     */     //   21: getfield children : Ljava/util/List;
/*     */     //   24: checkcast java/lang/Iterable
/*     */     //   27: astore_2
/*     */     //   28: aload_2
/*     */     //   29: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   34: astore_3
/*     */     //   35: aload_3
/*     */     //   36: invokeinterface hasNext : ()Z
/*     */     //   41: ifeq -> 81
/*     */     //   44: aload_3
/*     */     //   45: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   50: astore #4
/*     */     //   52: aload #4
/*     */     //   54: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   57: astore #5
/*     */     //   59: iconst_0
/*     */     //   60: istore #6
/*     */     //   62: aload #5
/*     */     //   64: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   69: aload_1
/*     */     //   70: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   73: ifeq -> 35
/*     */     //   76: aload #4
/*     */     //   78: goto -> 82
/*     */     //   81: aconst_null
/*     */     //   82: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   85: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #72	-> 6
/*     */     //   #73	-> 15
/*     */     //   #75	-> 20
/*     */     //   #525	-> 59
/*     */     //   #75	-> 62
/*     */     //   #75	-> 73
/*     */     //   #75	-> 85
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   62	11	6	$i$a$-find-ProjectStructureFolder$getChild$1	I
/*     */     //   59	14	5	it	Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   0	86	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;
/*     */     //   0	86	1	name	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final ProjectStructureItem findChild(@NotNull String filePath) {
/*  79 */     Intrinsics.checkNotNullParameter(filePath, "filePath"); char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/'; String[] arrayOfString = new String[1]; arrayOfString[0] = "/"; List<String> pathParts = CollectionsKt.toList(StringsKt.split$default(StringsKt.trimStart(filePath, arrayOfChar), arrayOfString, false, 0, 6, null));
/*     */     
/*  81 */     Object object = this;
/*  82 */     for (int i = 0, j = pathParts.size() - 1; i < j; i++) {
/*  83 */       ProjectStructureItem projectStructureItem = object.getChild(pathParts.get(i)); if (((projectStructureItem instanceof ProjectStructureFolder) ? projectStructureItem : null) == null) { (projectStructureItem instanceof ProjectStructureFolder) ? projectStructureItem : null; return null; }
/*     */     
/*  85 */     }  return object.getChild((String)CollectionsKt.last(pathParts));
/*     */   }
/*     */   @NotNull
/*     */   public final ProjectStructureFile findOrCreateFile(@NotNull String filePath) {
/*  89 */     Intrinsics.checkNotNullParameter(filePath, "filePath"); char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/'; String[] arrayOfString = new String[1]; arrayOfString[0] = "/"; List<String> pathParts = CollectionsKt.toList(StringsKt.split$default(StringsKt.trimStart(filePath, arrayOfChar), arrayOfString, false, 0, 6, null));
/*     */     
/*  91 */     ProjectStructureFolder parent = this;
/*  92 */     for (int i = 0, j = pathParts.size() - 1; i < j; i++) {
/*  93 */       parent = parent.getOrCreateChildFolder(pathParts.get(i));
/*     */     }
/*  95 */     return parent.getOrCreateChildFile((String)CollectionsKt.last(pathParts));
/*     */   }
/*     */   
/*     */   private final ProjectStructureBinaryFile findOrCreateBinaryFile(String filePath) {
/*  99 */     char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/'; String[] arrayOfString = new String[1]; arrayOfString[0] = "/"; List<String> pathParts = CollectionsKt.toList(StringsKt.split$default(StringsKt.trimStart(filePath, arrayOfChar), arrayOfString, false, 0, 6, null));
/* 100 */     ProjectStructureFolder parent = this;
/* 101 */     for (int i = 0, j = pathParts.size() - 1; i < j; i++) {
/* 102 */       parent = parent.getOrCreateChildFolder(pathParts.get(i));
/*     */     }
/* 104 */     return parent.getOrCreateChildBinaryFile((String)CollectionsKt.last(pathParts));
/*     */   }
/*     */   @NotNull
/*     */   public final ProjectStructureFile updateOrCreateFile(@NotNull String filePath, @NotNull String content) {
/* 108 */     Intrinsics.checkNotNullParameter(filePath, "filePath"); Intrinsics.checkNotNullParameter(content, "content"); ProjectStructureFile file = findOrCreateFile(filePath);
/* 109 */     file.setContent(content);
/* 110 */     return file;
/*     */   }
/*     */   @NotNull
/*     */   public final ProjectStructureBinaryFile updateOrCreateBinaryFile(@NotNull String filePath, @NotNull String mediaContentId, @NotNull String description) {
/* 114 */     Intrinsics.checkNotNullParameter(filePath, "filePath"); Intrinsics.checkNotNullParameter(mediaContentId, "mediaContentId"); Intrinsics.checkNotNullParameter(description, "description"); ProjectStructureBinaryFile file = findOrCreateBinaryFile(filePath);
/* 115 */     file.setMediaContentId(mediaContentId);
/* 116 */     file.setDescription(description);
/* 117 */     return file;
/*     */   }
/*     */   
/*     */   public final boolean removeChild(@NotNull String filePath) {
/* 121 */     Intrinsics.checkNotNullParameter(filePath, "filePath"); char[] arrayOfChar = new char[1]; arrayOfChar[0] = '/'; String[] arrayOfString = new String[1]; arrayOfString[0] = "/"; List<String> pathParts = CollectionsKt.toList(StringsKt.split$default(StringsKt.trimStart(filePath, arrayOfChar), arrayOfString, false, 0, 6, null));
/*     */     
/* 123 */     Object object = this;
/* 124 */     for (int i = 0, j = pathParts.size() - 1; i < j; i++) {
/* 125 */       ProjectStructureItem projectStructureItem = object.getChild(pathParts.get(i)); if (((projectStructureItem instanceof ProjectStructureFolder) ? projectStructureItem : null) == null) { (projectStructureItem instanceof ProjectStructureFolder) ? projectStructureItem : null; return false; }
/*     */     
/*     */     } 
/* 128 */     return ((ProjectStructureFolder)object).children.removeIf(pathParts::removeChild$lambda$7::removeChild$lambda$8); } private static final boolean removeChild$lambda$7(List $pathParts, ProjectStructureItem it) { Intrinsics.checkNotNullParameter(it, "it"); return Intrinsics.areEqual(it.getName(), CollectionsKt.last($pathParts)); } private static final boolean removeChild$lambda$8(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/* 132 */     return getName() + "/ (children: " + getName() + ")";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectStructureFolder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */