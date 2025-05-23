/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.maven;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.idea.maven.project.MavenProjectsManager;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J$\020\004\032\0020\0052\006\020\006\032\0020\0072\f\020\b\032\b\022\004\022\0020\n0\tH@¢\006\002\020\013J\032\020\f\032\0020\005*\0020\0072\006\020\r\032\0020\016H@¢\006\002\020\017J\024\020\020\032\004\030\0010\016*\b\022\004\022\0020\n0\tH\002¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/maven/MavenProjectConfigurator;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator;", "<init>", "()V", "configureProject", "", "project", "Lcom/intellij/openapi/project/Project;", "args", "", "", "(Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importPomXml", "pomXml", "Lcom/intellij/openapi/vfs/VirtualFile;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findPomXml", "ej-maven"})
/*    */ @SourceDebugExtension({"SMAP\nMavenProjectConfigurator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MavenProjectConfigurator.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/maven/MavenProjectConfigurator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n295#2,2:43\n1#3:45\n*S KotlinDebug\n*F\n+ 1 MavenProjectConfigurator.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/maven/MavenProjectConfigurator\n*L\n33#1:43,2\n*E\n"})
/*    */ public final class MavenProjectConfigurator implements IdeaProjectConfigurator {
/* 13 */   public void configureProjectSdk(@NotNull Project project, @NotNull Sdk javaHomeSdk) { IdeaProjectConfigurator.DefaultImpls.configureProjectSdk(this, project, javaHomeSdk); } @Nullable
/*    */   public Object configureProject(@NotNull Project project, @NotNull List<String> args, @NotNull Continuation<? super Unit> $completion) {
/* 15 */     VirtualFile pomXml = findPomXml(args); int $i$a$-let-MavenProjectConfigurator$configureProject$2 = 0;
/* 16 */     if (importPomXml(project, pomXml, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return importPomXml(project, pomXml, $completion);  importPomXml(project, pomXml, $completion);
/*    */     findPomXml(args);
/* 18 */     return Unit.INSTANCE;
/*    */   }
/*    */   private final Object importPomXml(Project $this$importPomXml, VirtualFile pomXml, Continuation $completion) {
/* 21 */     MavenProjectsManager manager = MavenProjectsManager.getInstance($this$importPomXml);
/* 22 */     if (!manager.isMavenizedProject()) {
/* 23 */       manager.addManagedFilesOrUnignoreNoUpdate(CollectionsKt.listOf(pomXml));
/* 24 */       if ((new MavenOpenProjectProvider()).linkToExistingProjectAsync(pomXml, $this$importPomXml, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return (new MavenOpenProjectProvider()).linkToExistingProjectAsync(pomXml, $this$importPomXml, $completion);  (new MavenOpenProjectProvider()).linkToExistingProjectAsync(pomXml, $this$importPomXml, $completion); return Unit.INSTANCE;
/*    */     } 
/* 26 */     MavenSyncSpec spec = MavenSyncSpec.Companion.full("IdeaAgentMatterhornStarter.MavenProjectReimport", true);
/* 27 */     if (manager.updateAllMavenProjects(spec, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return manager.updateAllMavenProjects(spec, $completion);  manager.updateAllMavenProjects(spec, $completion); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private final VirtualFile findPomXml(List $this$findPomXml) {
/*    */     // Byte code:
/*    */     //   0: ldc '--pom='
/*    */     //   2: astore_2
/*    */     //   3: aload_1
/*    */     //   4: checkcast java/lang/Iterable
/*    */     //   7: astore #5
/*    */     //   9: iconst_0
/*    */     //   10: istore #6
/*    */     //   12: aload #5
/*    */     //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   19: astore #7
/*    */     //   21: aload #7
/*    */     //   23: invokeinterface hasNext : ()Z
/*    */     //   28: ifeq -> 67
/*    */     //   31: aload #7
/*    */     //   33: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   38: astore #8
/*    */     //   40: aload #8
/*    */     //   42: checkcast java/lang/String
/*    */     //   45: astore #9
/*    */     //   47: iconst_0
/*    */     //   48: istore #10
/*    */     //   50: aload #9
/*    */     //   52: aload_2
/*    */     //   53: iconst_0
/*    */     //   54: iconst_2
/*    */     //   55: aconst_null
/*    */     //   56: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*    */     //   59: ifeq -> 21
/*    */     //   62: aload #8
/*    */     //   64: goto -> 68
/*    */     //   67: aconst_null
/*    */     //   68: checkcast java/lang/String
/*    */     //   71: astore #4
/*    */     //   73: aload #4
/*    */     //   75: ifnull -> 142
/*    */     //   78: aload #4
/*    */     //   80: aload_2
/*    */     //   81: ldc ''
/*    */     //   83: invokestatic substringAfter : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   86: astore #5
/*    */     //   88: aload #5
/*    */     //   90: ifnull -> 142
/*    */     //   93: aload #5
/*    */     //   95: astore #7
/*    */     //   97: aload #7
/*    */     //   99: astore #8
/*    */     //   101: iconst_0
/*    */     //   102: istore #9
/*    */     //   104: aload #8
/*    */     //   106: checkcast java/lang/CharSequence
/*    */     //   109: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   112: ifne -> 119
/*    */     //   115: iconst_1
/*    */     //   116: goto -> 120
/*    */     //   119: iconst_0
/*    */     //   120: nop
/*    */     //   121: ifeq -> 129
/*    */     //   124: aload #7
/*    */     //   126: goto -> 130
/*    */     //   129: aconst_null
/*    */     //   130: astore #6
/*    */     //   132: aload #6
/*    */     //   134: ifnull -> 142
/*    */     //   137: aload #6
/*    */     //   139: goto -> 144
/*    */     //   142: aconst_null
/*    */     //   143: areturn
/*    */     //   144: astore_3
/*    */     //   145: aload_3
/*    */     //   146: iconst_0
/*    */     //   147: anewarray java/lang/String
/*    */     //   150: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   153: astore #6
/*    */     //   155: aload #6
/*    */     //   157: astore #7
/*    */     //   159: iconst_0
/*    */     //   160: istore #8
/*    */     //   162: aload #7
/*    */     //   164: iconst_0
/*    */     //   165: anewarray java/nio/file/LinkOption
/*    */     //   168: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*    */     //   171: ifeq -> 179
/*    */     //   174: aload #6
/*    */     //   176: goto -> 180
/*    */     //   179: aconst_null
/*    */     //   180: dup
/*    */     //   181: ifnonnull -> 187
/*    */     //   184: pop
/*    */     //   185: aconst_null
/*    */     //   186: areturn
/*    */     //   187: astore #4
/*    */     //   189: aload #4
/*    */     //   191: invokeinterface toFile : ()Ljava/io/File;
/*    */     //   196: iconst_1
/*    */     //   197: invokestatic findFileByIoFile : (Ljava/io/File;Z)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   200: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 0
/*    */     //   #33	-> 3
/*    */     //   #35	-> 3
/*    */     //   #33	-> 3
/*    */     //   #43	-> 12
/*    */     //   #33	-> 50
/*    */     //   #43	-> 59
/*    */     //   #44	-> 67
/*    */     //   #33	-> 68
/*    */     //   #34	-> 73
/*    */     //   #33	-> 78
/*    */     //   #34	-> 80
/*    */     //   #35	-> 88
/*    */     //   #33	-> 93
/*    */     //   #35	-> 97
/*    */     //   #45	-> 101
/*    */     //   #35	-> 104
/*    */     //   #35	-> 120
/*    */     //   #35	-> 121
/*    */     //   #35	-> 130
/*    */     //   #33	-> 130
/*    */     //   #36	-> 142
/*    */     //   #33	-> 144
/*    */     //   #38	-> 145
/*    */     //   #45	-> 159
/*    */     //   #38	-> 162
/*    */     //   #38	-> 171
/*    */     //   #38	-> 180
/*    */     //   #39	-> 189
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   50	9	10	$i$a$-firstOrNull-MavenProjectConfigurator$findPomXml$fileName$1	I
/*    */     //   47	12	9	it	Ljava/lang/String;
/*    */     //   40	27	8	element$iv	Ljava/lang/Object;
/*    */     //   12	56	6	$i$f$firstOrNull	I
/*    */     //   9	59	5	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*    */     //   104	17	9	$i$a$-takeIf-MavenProjectConfigurator$findPomXml$fileName$2	I
/*    */     //   101	20	8	it	Ljava/lang/String;
/*    */     //   162	9	8	$i$a$-takeIf-MavenProjectConfigurator$findPomXml$path$1	I
/*    */     //   159	12	7	it	Ljava/nio/file/Path;
/*    */     //   3	198	2	prefix	Ljava/lang/String;
/*    */     //   145	56	3	fileName	Ljava/lang/String;
/*    */     //   189	12	4	path	Ljava/nio/file/Path;
/*    */     //   0	201	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/maven/MavenProjectConfigurator;
/*    */     //   0	201	1	$this$findPomXml	Ljava/util/List;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\maven\MavenProjectConfigurator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */