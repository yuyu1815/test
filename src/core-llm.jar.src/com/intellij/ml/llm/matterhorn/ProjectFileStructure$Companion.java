/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000~\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020$\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\b\032\0020\t*\0020\n2\022\020\013\032\016\022\004\022\0020\r\022\004\022\0020\t0\fJ\016\020\016\032\0020\0172\006\020\020\032\0020\021J*\020\026\032\0020\t2\006\020\027\032\0020\0302\006\020\031\032\0020\n2\006\020\032\032\0020\0212\b\b\002\020\033\032\0020\017H\002J\f\020\034\032\0020\017*\0020\021H\002J,\020\035\032\0020\t2\006\020\031\032\0020\n2\n\020\036\032\0060\037j\002` 2\006\020!\032\0020\"2\006\020#\032\0020\024H\002J,\020$\032\0020\t2\006\020\031\032\0020\n2\006\020%\032\0020\0242\n\020\036\032\0060\037j\002` 2\006\020!\032\0020\"H\002J\"\020&\032\0020\t2\n\020\036\032\0060'j\002`(2\006\020\020\032\0020\r2\006\020)\032\0020\024J\"\020*\032\0020\t2\n\020\036\032\0060'j\002`(2\006\020)\032\0020\0242\006\020+\032\0020,J\f\0202\032\b\022\004\022\0020403R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\024\020\022\032\b\022\004\022\0020\0240\023X\004¢\006\002\n\000R\024\020\025\032\b\022\004\022\0020\0240\023X\004¢\006\002\n\000R\035\020-\032\016\022\004\022\0020\024\022\004\022\0020\0240.¢\006\b\n\000\032\004\b/\0200R\016\0201\032\0020\024XT¢\006\002\n\000¨\0065"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "forEachFile", "", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;", "processor", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFile;", "isIgnored", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "ignoreFolders", "", "", "ignoreFiles", "apply", "mediaStorage", "Lcom/intellij/ml/llm/matterhorn/MediaStorage;", "folder", "projectFolder", "deleteRemainingFiles", "isHiddenFolder", "dumpProjectDirectoryStructure", "accumulator", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "filter", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter;", "indent", "dumpProjectDirectoryFiles", "folderPath", "appendFileTo", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "filePath", "appendBinaryFileTo", "binaryFile", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile;", "extensionToLanguage", "", "getExtensionToLanguage", "()Ljava/util/Map;", "SEPARATOR", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectFileStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectFileStructure.kt\ncom/intellij/ml/llm/matterhorn/ProjectFileStructure$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,524:1\n1#2:525\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<ProjectFileStructure> serializer() {
/* 237 */     return (KSerializer<ProjectFileStructure>)ProjectFileStructure.$serializer.INSTANCE; } @NotNull
/* 238 */   public final Logger getLogger() { return ProjectFileStructure.access$getLogger$cp(); }
/*     */   
/*     */   public final void forEachFile(@NotNull ProjectStructureFolder $this$forEachFile, @NotNull Function1<? super ProjectStructureFile, Unit> processor) {
/* 241 */     Intrinsics.checkNotNullParameter($this$forEachFile, "<this>"); Intrinsics.checkNotNullParameter(processor, "processor"); for (ProjectStructureItem child : $this$forEachFile.getChildren()) {
/* 242 */       if (child instanceof ProjectStructureFolder) {
/* 243 */         forEachFile((ProjectStructureFolder)child, processor); continue;
/*     */       } 
/* 245 */       if (child instanceof ProjectStructureFile) {
/* 246 */         processor.invoke(child);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isIgnored(@NotNull VirtualFile file) {
/* 253 */     Intrinsics.checkNotNullParameter(file, "file"); return ((file.isDirectory() && ProjectFileStructure.access$getIgnoreFolders$cp().contains(file.getName())) || (VirtualFileUtil.isFile(file) && ProjectFileStructure.access$getIgnoreFiles$cp().contains(file.getName())));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void apply(MediaStorage mediaStorage, ProjectStructureFolder folder, VirtualFile projectFolder, boolean deleteRemainingFiles) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: invokevirtual getChildren : ()[Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   4: invokestatic iterator : ([Ljava/lang/Object;)Ljava/util/Iterator;
/*     */     //   7: astore #5
/*     */     //   9: aload #5
/*     */     //   11: invokeinterface hasNext : ()Z
/*     */     //   16: ifeq -> 163
/*     */     //   19: aload #5
/*     */     //   21: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   26: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   29: astore #6
/*     */     //   31: aload #6
/*     */     //   33: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   36: dup
/*     */     //   37: ldc 'getName(...)'
/*     */     //   39: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   42: astore #7
/*     */     //   44: invokestatic access$getIgnoreFiles$cp : ()Ljava/util/List;
/*     */     //   47: aload #7
/*     */     //   49: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   54: ifne -> 9
/*     */     //   57: invokestatic access$getIgnoreFolders$cp : ()Ljava/util/List;
/*     */     //   60: aload #7
/*     */     //   62: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   67: ifne -> 9
/*     */     //   70: aload_0
/*     */     //   71: aload #6
/*     */     //   73: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   76: aload #6
/*     */     //   78: invokespecial isHiddenFolder : (Lcom/intellij/openapi/vfs/VirtualFile;)Z
/*     */     //   81: ifne -> 9
/*     */     //   84: aload_2
/*     */     //   85: aload #7
/*     */     //   87: invokevirtual getChild : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   90: ifnull -> 133
/*     */     //   93: aload #6
/*     */     //   95: invokestatic isFile : (Lcom/intellij/openapi/vfs/VirtualFile;)Z
/*     */     //   98: ifeq -> 113
/*     */     //   101: aload_2
/*     */     //   102: aload #7
/*     */     //   104: invokevirtual getChild : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   107: instanceof com/intellij/ml/llm/matterhorn/ProjectStructureFolder
/*     */     //   110: ifne -> 133
/*     */     //   113: aload #6
/*     */     //   115: invokevirtual isDirectory : ()Z
/*     */     //   118: ifeq -> 9
/*     */     //   121: aload_2
/*     */     //   122: aload #7
/*     */     //   124: invokevirtual getChild : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   127: instanceof com/intellij/ml/llm/matterhorn/ProjectStructureFile
/*     */     //   130: ifeq -> 9
/*     */     //   133: iload #4
/*     */     //   135: ifne -> 154
/*     */     //   138: getstatic com/intellij/ml/llm/matterhorn/helpers/ProjectStateHelper.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/ProjectStateHelper;
/*     */     //   141: invokevirtual getMatterhornProjectFolders : ()Ljava/util/List;
/*     */     //   144: aload #7
/*     */     //   146: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   151: ifeq -> 9
/*     */     //   154: aload #6
/*     */     //   156: aload_0
/*     */     //   157: invokevirtual delete : (Ljava/lang/Object;)V
/*     */     //   160: goto -> 9
/*     */     //   163: aload_2
/*     */     //   164: invokevirtual getChildren : ()Ljava/util/List;
/*     */     //   167: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   172: astore #5
/*     */     //   174: aload #5
/*     */     //   176: invokeinterface hasNext : ()Z
/*     */     //   181: ifeq -> 429
/*     */     //   184: aload #5
/*     */     //   186: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   191: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureItem
/*     */     //   194: astore #6
/*     */     //   196: aload #6
/*     */     //   198: instanceof com/intellij/ml/llm/matterhorn/ProjectStructureFolder
/*     */     //   201: ifeq -> 257
/*     */     //   204: aload_3
/*     */     //   205: aload #6
/*     */     //   207: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureFolder
/*     */     //   210: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   213: invokestatic findOrCreateDirectory : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   216: astore #7
/*     */     //   218: iconst_0
/*     */     //   219: iconst_0
/*     */     //   220: iconst_0
/*     */     //   221: iconst_1
/*     */     //   222: anewarray com/intellij/openapi/vfs/VirtualFile
/*     */     //   225: astore #8
/*     */     //   227: aload #8
/*     */     //   229: iconst_0
/*     */     //   230: aload #7
/*     */     //   232: aastore
/*     */     //   233: aload #8
/*     */     //   235: invokestatic markDirtyAndRefresh : (ZZZ[Lcom/intellij/openapi/vfs/VirtualFile;)V
/*     */     //   238: aload_0
/*     */     //   239: aload_1
/*     */     //   240: aload #6
/*     */     //   242: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureFolder
/*     */     //   245: aload #7
/*     */     //   247: iconst_0
/*     */     //   248: bipush #8
/*     */     //   250: aconst_null
/*     */     //   251: invokestatic apply$default : (Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure$Companion;Lcom/intellij/ml/llm/matterhorn/MediaStorage;Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;Lcom/intellij/openapi/vfs/VirtualFile;ZILjava/lang/Object;)V
/*     */     //   254: goto -> 174
/*     */     //   257: aload #6
/*     */     //   259: instanceof com/intellij/ml/llm/matterhorn/ProjectStructureFile
/*     */     //   262: ifeq -> 335
/*     */     //   265: aload_3
/*     */     //   266: aload #6
/*     */     //   268: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureFile
/*     */     //   271: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   274: invokestatic findOrCreateFile : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   277: astore #7
/*     */     //   279: iconst_0
/*     */     //   280: iconst_0
/*     */     //   281: iconst_0
/*     */     //   282: iconst_1
/*     */     //   283: anewarray com/intellij/openapi/vfs/VirtualFile
/*     */     //   286: astore #8
/*     */     //   288: aload #8
/*     */     //   290: iconst_0
/*     */     //   291: aload #7
/*     */     //   293: aastore
/*     */     //   294: aload #8
/*     */     //   296: invokestatic markDirtyAndRefresh : (ZZZ[Lcom/intellij/openapi/vfs/VirtualFile;)V
/*     */     //   299: aload #7
/*     */     //   301: aload #6
/*     */     //   303: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureFile
/*     */     //   306: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   309: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   312: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
/*     */     //   315: dup
/*     */     //   316: ldc 'getBytes(...)'
/*     */     //   318: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   321: ldc2_w -1
/*     */     //   324: ldc2_w -1
/*     */     //   327: aload #6
/*     */     //   329: invokevirtual setBinaryContent : ([BJJLjava/lang/Object;)V
/*     */     //   332: goto -> 174
/*     */     //   335: aload #6
/*     */     //   337: instanceof com/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile
/*     */     //   340: ifeq -> 174
/*     */     //   343: aload_3
/*     */     //   344: aload #6
/*     */     //   346: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile
/*     */     //   349: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   352: invokestatic findOrCreateFile : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   355: astore #7
/*     */     //   357: iconst_0
/*     */     //   358: iconst_0
/*     */     //   359: iconst_0
/*     */     //   360: iconst_1
/*     */     //   361: anewarray com/intellij/openapi/vfs/VirtualFile
/*     */     //   364: astore #8
/*     */     //   366: aload #8
/*     */     //   368: iconst_0
/*     */     //   369: aload #7
/*     */     //   371: aastore
/*     */     //   372: aload #8
/*     */     //   374: invokestatic markDirtyAndRefresh : (ZZZ[Lcom/intellij/openapi/vfs/VirtualFile;)V
/*     */     //   377: aload #6
/*     */     //   379: checkcast com/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile
/*     */     //   382: invokevirtual getMediaContentId : ()Ljava/lang/String;
/*     */     //   385: dup
/*     */     //   386: ifnull -> 405
/*     */     //   389: astore #9
/*     */     //   391: iconst_0
/*     */     //   392: istore #10
/*     */     //   394: aload_1
/*     */     //   395: aload #9
/*     */     //   397: invokestatic getOrThrow : (Lcom/intellij/ml/llm/matterhorn/MediaStorage;Ljava/lang/String;)[B
/*     */     //   400: nop
/*     */     //   401: dup
/*     */     //   402: ifnonnull -> 409
/*     */     //   405: pop
/*     */     //   406: iconst_0
/*     */     //   407: newarray byte
/*     */     //   409: astore #8
/*     */     //   411: aload #7
/*     */     //   413: aload #8
/*     */     //   415: ldc2_w -1
/*     */     //   418: ldc2_w -1
/*     */     //   421: aload #6
/*     */     //   423: invokevirtual setBinaryContent : ([BJJLjava/lang/Object;)V
/*     */     //   426: goto -> 174
/*     */     //   429: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #260	-> 0
/*     */     //   #261	-> 31
/*     */     //   #262	-> 44
/*     */     //   #263	-> 84
/*     */     //   #264	-> 93
/*     */     //   #265	-> 113
/*     */     //   #267	-> 133
/*     */     //   #268	-> 154
/*     */     //   #273	-> 163
/*     */     //   #274	-> 196
/*     */     //   #275	-> 204
/*     */     //   #276	-> 218
/*     */     //   #277	-> 238
/*     */     //   #279	-> 257
/*     */     //   #280	-> 265
/*     */     //   #281	-> 279
/*     */     //   #282	-> 299
/*     */     //   #282	-> 321
/*     */     //   #283	-> 335
/*     */     //   #284	-> 343
/*     */     //   #285	-> 357
/*     */     //   #286	-> 377
/*     */     //   #525	-> 391
/*     */     //   #286	-> 394
/*     */     //   #286	-> 400
/*     */     //   #286	-> 401
/*     */     //   #287	-> 411
/*     */     //   #290	-> 429
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	116	7	name	Ljava/lang/String;
/*     */     //   31	129	6	projectFolderChild	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   218	36	7	newProjectFolder	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   279	53	7	newProjectFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   394	6	10	$i$a$-let-ProjectFileStructure$Companion$apply$binaryContent$1	I
/*     */     //   391	9	9	it	Ljava/lang/String;
/*     */     //   357	69	7	newProjectFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   411	15	8	binaryContent	[B
/*     */     //   196	230	6	child	Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;
/*     */     //   0	430	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure$Companion;
/*     */     //   0	430	1	mediaStorage	Lcom/intellij/ml/llm/matterhorn/MediaStorage;
/*     */     //   0	430	2	folder	Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;
/*     */     //   0	430	3	projectFolder	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	430	4	deleteRemainingFiles	Z
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final boolean isHiddenFolder(VirtualFile $this$isHiddenFolder) {
/* 292 */     Intrinsics.checkNotNullExpressionValue($this$isHiddenFolder.getName(), "getName(...)"); return ($this$isHiddenFolder.isDirectory() && StringsKt.startsWith$default($this$isHiddenFolder.getName(), ".", false, 2, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void dumpProjectDirectoryStructure(ProjectStructureFolder folder, StringBuilder accumulator, ProjectFileStructureFilter filter, String indent) {
/* 300 */     for (ProjectStructureItem child : folder.getChildren()) {
/* 301 */       if (filter.acceptForStructure(child)) {
/*     */         
/* 303 */         Intrinsics.checkNotNullExpressionValue(accumulator.append(indent + "- " + indent + "/"), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append(indent + "- " + indent + "/").append('\n'), "append(...)"); accumulator.append(indent + "- " + indent + "/").append('\n');
/* 304 */         dumpProjectDirectoryStructure((ProjectStructureFolder)child, accumulator, filter, indent + "  ");
/*     */         
/* 306 */         Intrinsics.checkNotNullExpressionValue(accumulator.append(indent + "- " + indent), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append(indent + "- " + indent).append('\n'), "append(...)"); (child instanceof ProjectStructureFolder) ? Unit.INSTANCE : accumulator.append(indent + "- " + indent).append('\n');
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void dumpProjectDirectoryFiles(ProjectStructureFolder folder, String folderPath, StringBuilder accumulator, ProjectFileStructureFilter filter) {
/* 317 */     for (ProjectStructureItem child : folder.getChildren()) {
/* 318 */       if (!filter.acceptForStructure(child) || !filter.acceptForSource(child))
/*     */         continue; 
/* 320 */       String path = ((((CharSequence)folderPath).length() == 0)) ? child.getName() : (folderPath + "/" + folderPath);
/* 321 */       if (child instanceof ProjectStructureFolder) {
/* 322 */         dumpProjectDirectoryFiles((ProjectStructureFolder)child, path, accumulator, filter); continue;
/* 323 */       }  if (child instanceof ProjectStructureFile) {
/* 324 */         Intrinsics.checkNotNullExpressionValue(accumulator.append('\n'), "append(...)"); accumulator.append('\n');
/* 325 */         Intrinsics.checkNotNullExpressionValue(accumulator.append('\n'), "append(...)"); accumulator.append('\n');
/* 326 */         appendFileTo(accumulator, (ProjectStructureFile)child, path); continue;
/*     */       } 
/* 328 */       if (child instanceof ProjectStructureBinaryFile) {
/* 329 */         Intrinsics.checkNotNullExpressionValue(accumulator.append('\n'), "append(...)"); accumulator.append('\n');
/* 330 */         Intrinsics.checkNotNullExpressionValue(accumulator.append('\n'), "append(...)"); accumulator.append('\n');
/* 331 */         appendBinaryFileTo(accumulator, path, (ProjectStructureBinaryFile)child);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void appendFileTo(@NotNull Appendable accumulator, @NotNull ProjectStructureFile file, @NotNull String filePath) {
/* 337 */     Intrinsics.checkNotNullParameter(accumulator, "accumulator"); Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(filePath, "filePath"); String[] arrayOfString = new String[1]; arrayOfString[0] = "."; String extension = (String)CollectionsKt.last(StringsKt.split$default(file.getName(), arrayOfString, false, 0, 6, null));
/* 338 */     Intrinsics.checkNotNullExpressionValue(extension.toLowerCase(Locale.ROOT), "toLowerCase(...)"); if ((String)getExtensionToLanguage().get(extension.toLowerCase(Locale.ROOT)) == null) (String)getExtensionToLanguage().get(extension.toLowerCase(Locale.ROOT));  String language = "";
/*     */     
/* 340 */     Intrinsics.checkNotNullExpressionValue(accumulator.append("FILE: " + filePath), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append("FILE: " + filePath).append('\n'), "append(...)"); accumulator.append("FILE: " + filePath).append('\n');
/*     */     
/* 342 */     Intrinsics.checkNotNullExpressionValue(accumulator.append("````" + language), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append("````" + language).append('\n'), "append(...)"); accumulator.append("````" + language).append('\n');
/* 343 */     Intrinsics.checkNotNullExpressionValue(accumulator.append(file.getContent()), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append(file.getContent()).append('\n'), "append(...)"); accumulator.append(file.getContent()).append('\n');
/* 344 */     Intrinsics.checkNotNullExpressionValue(accumulator.append("````"), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append("````").append('\n'), "append(...)");
/*     */ 
/*     */     
/* 347 */     Intrinsics.checkNotNullExpressionValue(accumulator.append("```" + language), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append("```" + language).append('\n'), "append(...)"); accumulator.append("```" + language).append('\n');
/* 348 */     Intrinsics.checkNotNullExpressionValue(accumulator.append(file.getContent()), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append(file.getContent()).append('\n'), "append(...)"); accumulator.append(file.getContent()).append('\n');
/* 349 */     Intrinsics.checkNotNullExpressionValue(accumulator.append("```"), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append("```").append('\n'), "append(...)"); StringsKt.contains$default(file.getContent(), "```", false, 2, null) ? accumulator.append("````").append('\n') : accumulator.append("```").append('\n');
/*     */   }
/*     */ 
/*     */   
/*     */   public final void appendBinaryFileTo(@NotNull Appendable accumulator, @NotNull String filePath, @NotNull ProjectStructureBinaryFile binaryFile) {
/* 354 */     Intrinsics.checkNotNullParameter(accumulator, "accumulator"); Intrinsics.checkNotNullParameter(filePath, "filePath"); Intrinsics.checkNotNullParameter(binaryFile, "binaryFile"); Intrinsics.checkNotNullExpressionValue(accumulator.append("FILE: " + filePath + ", description: " + binaryFile.getDescription()), "append(...)"); Intrinsics.checkNotNullExpressionValue(accumulator.append("FILE: " + filePath + ", description: " + binaryFile.getDescription()).append('\n'), "append(...)"); accumulator.append("FILE: " + filePath + ", description: " + binaryFile.getDescription()).append('\n');
/*     */   } @NotNull
/*     */   public final Map<String, String> getExtensionToLanguage() {
/* 357 */     return ProjectFileStructure.access$getExtensionToLanguage$cp();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructure$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */