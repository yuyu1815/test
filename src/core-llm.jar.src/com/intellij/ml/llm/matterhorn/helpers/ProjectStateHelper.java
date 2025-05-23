/*    */ package com.intellij.ml.llm.matterhorn.helpers;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*    */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*    */ import com.intellij.ml.llm.matterhorn.ProjectFileStructure;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016J\016\020\017\032\0020\0202\006\020\013\032\0020\fJ\030\020\021\032\0020\0222\006\020\023\032\0020\0162\006\020\r\032\0020\016H\002J \020\024\032\0020\n2\006\020\025\032\0020\0222\006\020\026\032\0020\0162\006\020\027\032\0020\006H\002R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/helpers/ProjectStateHelper;", "", "<init>", "()V", "matterhornProjectFolders", "", "", "getMatterhornProjectFolders", "()Ljava/util/List;", "saveInitialProjectState", "", "project", "Lcom/intellij/openapi/project/Project;", "descriptionFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "restoreInitialProjectState", "", "getCurrentProjectState", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "projectDir", "storeFileContent", "projectStructure", "file", "projectDirPath", "core"})
/*    */ @SourceDebugExtension({"SMAP\nProjectStateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectStateHelper.kt\ncom/intellij/ml/llm/matterhorn/helpers/ProjectStateHelper\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,80:1\n31#2,2:81\n31#2,2:84\n205#3:83\n222#3:87\n1#4:86\n3829#5:88\n4344#5,2:89\n4154#5:91\n4254#5,2:92\n1863#6,2:94\n14#7:96\n*S KotlinDebug\n*F\n+ 1 ProjectStateHelper.kt\ncom/intellij/ml/llm/matterhorn/helpers/ProjectStateHelper\n*L\n19#1:81,2\n35#1:84,2\n26#1:83\n43#1:87\n56#1:88\n56#1:89,2\n59#1:91\n59#1:92,2\n59#1:94,2\n77#1:96\n*E\n"})
/*    */ public final class ProjectStateHelper {
/*    */   @NotNull
/* 16 */   public static final ProjectStateHelper INSTANCE = new ProjectStateHelper(); @NotNull private static final List<String> matterhornProjectFolders; @NotNull public final List<String> getMatterhornProjectFolders() { return matterhornProjectFolders; } static { String[] arrayOfString = new String[3]; arrayOfString[0] = "api"; arrayOfString[1] = "backend"; arrayOfString[2] = "frontend"; matterhornProjectFolders = CollectionsKt.listOf((Object[])arrayOfString); }
/*    */ 
/*    */   
/* 19 */   public final void saveInitialProjectState(@NotNull Project project, @NotNull VirtualFile descriptionFile) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(descriptionFile, "descriptionFile"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 81 */     Class<ArtifactRequestExecutorService> serviceClass$iv = ArtifactRequestExecutorService.class;
/* 82 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  ArtifactRequestExecutorService service = (ArtifactRequestExecutorService)$this$service$iv.getService(serviceClass$iv); MatterhornCaches cache = service.getCaches(); String initialStateFile = project.getName() + ".initial_state"; if (!cache.contains(CacheType.Sources, initialStateFile)) {
/* 83 */       ProjectFileStructure currentState = getCurrentProjectState(service.getProjectPath(), descriptionFile); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0; this_$iv.getSerializersModule(); String content = this_$iv.encodeToString((SerializationStrategy)ProjectFileStructure.Companion.serializer(), currentState); cache.save(CacheType.Sources, initialStateFile, content);
/*    */     }  }
/*    */   public final boolean restoreInitialProjectState(@NotNull Project project) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'project'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: checkcast com/intellij/openapi/components/ComponentManager
/*    */     //   10: astore_3
/*    */     //   11: iconst_0
/*    */     //   12: istore #4
/*    */     //   14: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*    */     //   16: astore #5
/*    */     //   18: aload_3
/*    */     //   19: aload #5
/*    */     //   21: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*    */     //   26: dup
/*    */     //   27: ifnonnull -> 38
/*    */     //   30: pop
/*    */     //   31: aload_3
/*    */     //   32: aload #5
/*    */     //   34: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*    */     //   37: athrow
/*    */     //   38: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*    */     //   41: astore_2
/*    */     //   42: aload_2
/*    */     //   43: invokevirtual getCaches : ()Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*    */     //   46: astore_3
/*    */     //   47: aload_3
/*    */     //   48: getstatic com/intellij/ml/llm/matterhorn/CacheType.Sources : Lcom/intellij/ml/llm/matterhorn/CacheType;
/*    */     //   51: invokeinterface loadAllPaths : (Lcom/intellij/ml/llm/matterhorn/CacheType;)Ljava/lang/Iterable;
/*    */     //   56: astore #4
/*    */     //   58: aload #4
/*    */     //   60: astore #7
/*    */     //   62: aload #7
/*    */     //   64: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   69: astore #8
/*    */     //   71: aload #8
/*    */     //   73: invokeinterface hasNext : ()Z
/*    */     //   78: ifeq -> 118
/*    */     //   81: aload #8
/*    */     //   83: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   88: astore #9
/*    */     //   90: aload #9
/*    */     //   92: checkcast java/lang/String
/*    */     //   95: astore #10
/*    */     //   97: iconst_0
/*    */     //   98: istore #11
/*    */     //   100: aload #10
/*    */     //   102: ldc '.initial_state'
/*    */     //   104: iconst_0
/*    */     //   105: iconst_2
/*    */     //   106: aconst_null
/*    */     //   107: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*    */     //   110: ifeq -> 71
/*    */     //   113: aload #9
/*    */     //   115: goto -> 119
/*    */     //   118: aconst_null
/*    */     //   119: checkcast java/lang/String
/*    */     //   122: astore #5
/*    */     //   124: aload #5
/*    */     //   126: ifnonnull -> 131
/*    */     //   129: iconst_0
/*    */     //   130: ireturn
/*    */     //   131: aload_3
/*    */     //   132: getstatic com/intellij/ml/llm/matterhorn/CacheType.Sources : Lcom/intellij/ml/llm/matterhorn/CacheType;
/*    */     //   135: aload #5
/*    */     //   137: invokeinterface load : (Lcom/intellij/ml/llm/matterhorn/CacheType;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   142: dup
/*    */     //   143: ifnonnull -> 149
/*    */     //   146: pop
/*    */     //   147: iconst_0
/*    */     //   148: ireturn
/*    */     //   149: astore #6
/*    */     //   151: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*    */     //   154: checkcast kotlinx/serialization/json/Json
/*    */     //   157: astore #8
/*    */     //   159: iconst_0
/*    */     //   160: istore #9
/*    */     //   162: aload #8
/*    */     //   164: aload #8
/*    */     //   166: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*    */     //   169: pop
/*    */     //   170: getstatic com/intellij/ml/llm/matterhorn/ProjectFileStructure.Companion : Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure$Companion;
/*    */     //   173: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   176: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   179: aload #6
/*    */     //   181: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   184: checkcast com/intellij/ml/llm/matterhorn/ProjectFileStructure
/*    */     //   187: astore #7
/*    */     //   189: aload #7
/*    */     //   191: aload_3
/*    */     //   192: aload_2
/*    */     //   193: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;)Lcom/intellij/util/ThrowableRunnable;
/*    */     //   198: invokestatic run : (Lcom/intellij/util/ThrowableRunnable;)V
/*    */     //   201: aload_3
/*    */     //   202: invokeinterface clear : ()V
/*    */     //   207: iconst_1
/*    */     //   208: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 6
/*    */     //   #84	-> 14
/*    */     //   #85	-> 18
/*    */     //   #35	-> 38
/*    */     //   #36	-> 42
/*    */     //   #38	-> 47
/*    */     //   #39	-> 58
/*    */     //   #86	-> 97
/*    */     //   #39	-> 100
/*    */     //   #39	-> 110
/*    */     //   #39	-> 119
/*    */     //   #40	-> 124
/*    */     //   #41	-> 131
/*    */     //   #43	-> 151
/*    */     //   #87	-> 162
/*    */     //   #43	-> 184
/*    */     //   #44	-> 189
/*    */     //   #48	-> 201
/*    */     //   #49	-> 207
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   14	24	4	$i$f$service	I
/*    */     //   18	20	5	serviceClass$iv	Ljava/lang/Class;
/*    */     //   11	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*    */     //   100	10	11	$i$a$-find-ProjectStateHelper$restoreInitialProjectState$initialStatePath$1	I
/*    */     //   97	13	10	it	Ljava/lang/String;
/*    */     //   162	22	9	$i$f$decodeFromString	I
/*    */     //   159	25	8	this_$iv	Lkotlinx/serialization/json/Json;
/*    */     //   42	167	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*    */     //   47	162	3	cache	Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*    */     //   58	151	4	sourcePaths	Ljava/lang/Iterable;
/*    */     //   124	85	5	initialStatePath	Ljava/lang/String;
/*    */     //   151	58	6	initialStateText	Ljava/lang/String;
/*    */     //   189	20	7	projectStructure	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*    */     //   0	209	0	this	Lcom/intellij/ml/llm/matterhorn/helpers/ProjectStateHelper;
/*    */     //   0	209	1	project	Lcom/intellij/openapi/project/Project; }
/*    */   private static final void restoreInitialProjectState$lambda$1(ProjectFileStructure $projectStructure, MatterhornCaches $cache, ArtifactRequestExecutorService $service) { $projectStructure.apply((MediaStorage)new MatterhornCachesMediaStorage($cache), $service.getProjectPath(), false); } private final ProjectFileStructure getCurrentProjectState(VirtualFile projectDir, VirtualFile descriptionFile) { String projectDirPath; Iterator iterator; List<VirtualFile> matterhornDirs; ProjectFileStructure projectStructure = new ProjectFileStructure(); if (projectDir.getCanonicalPath() != null)
/*    */     { projectDirPath = projectDir.getCanonicalPath(); int $i$a$-let-ProjectStateHelper$getCurrentProjectState$1 = 0; INSTANCE.storeFileContent(projectStructure, descriptionFile, projectDirPath); Intrinsics.checkNotNullExpressionValue(projectDir.getChildren(), "getChildren(...)"); Object[] $this$filter$iv = (Object[])projectDir.getChildren(); int $i$f$filter = 0;
/* 88 */       Object[] arrayOfObject1 = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; byte b; int i;
/* 89 */       for (b = 0, i = arrayOfObject1.length; b < i; ) { Object element$iv$iv = arrayOfObject1[b]; VirtualFile it = (VirtualFile)element$iv$iv; int $i$a$-filter-ProjectStateHelper$getCurrentProjectState$1$matterhornDirs$1 = 0; }
/* 90 */        matterhornDirs = CollectionsKt.toMutableList(destination$iv$iv); } else { projectDir.getCanonicalPath(); return projectStructure; }
/* 91 */      if (!matterhornDirs.isEmpty()) { VirtualFile directory = matterhornDirs.removeFirst(); Intrinsics.checkNotNullExpressionValue(directory.getChildren(), "getChildren(...)"); Object[] arrayOfObject1 = (Object[])directory.getChildren(); ProjectFileStructure.Companion companion = ProjectFileStructure.Companion; int $i$f$filterNot = 0; Object[] arrayOfObject2 = arrayOfObject1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0; byte b; int i;
/* 92 */       for (b = 0, i = arrayOfObject2.length; b < i; ) { Object element$iv$iv = arrayOfObject2[b]; VirtualFile p0 = (VirtualFile)element$iv$iv; int $i$a$-filterNot-ProjectStateHelper$getCurrentProjectState$1$1 = 0; if (!companion.isIgnored(p0)) destination$iv$iv.add(element$iv$iv);  }
/* 93 */        List list = (List)destination$iv$iv; int $i$f$forEach = 0;
/* 94 */       iterator = list.iterator(); } else {  }  if (iterator.hasNext()) { Object element$iv = iterator.next(); VirtualFile child = (VirtualFile)element$iv; int $i$a$-forEach-ProjectStateHelper$getCurrentProjectState$1$2 = 0; if (child.isDirectory()) { matterhornDirs.add(child); } else { Intrinsics.checkNotNull(child); if (VirtualFileUtil.isFile(child))
/*    */           INSTANCE.storeFileContent(projectStructure, child, projectDirPath);  }  }  } private final void storeFileContent(ProjectFileStructure projectStructure, VirtualFile file, String projectDirPath) { Intrinsics.checkNotNullExpressionValue(file.getPath(), "getPath(...)"); String filePath = file.getPath(); String relativePath = StringsKt.substringAfter$default(filePath, projectDirPath, null, 2, null); try { Intrinsics.checkNotNullExpressionValue(file.getInputStream(), "getInputStream(...)"); InputStream inputStream = file.getInputStream(); Charset charset = Charsets.UTF_8; projectStructure.getRoot().findOrCreateFile(relativePath).setContent(TextStreamsKt.readText(new InputStreamReader(inputStream, charset))); }
/* 96 */     catch (IOException e) { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ProjectStateHelper.class), "getInstance(...)"); Logger.getInstance(ProjectStateHelper.class).info("Couldn't read file " + filePath, e); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\helpers\ProjectStateHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */