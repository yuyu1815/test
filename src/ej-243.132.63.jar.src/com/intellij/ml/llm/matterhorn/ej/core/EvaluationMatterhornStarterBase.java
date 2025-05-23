/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b&\030\000 \0232\0020\001:\001\023B\023\022\n\020\002\032\006\022\002\b\0030\003¢\006\004\b\004\020\005J<\020\006\032\n\022\002\b\003\022\002\b\0030\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\f\020\013\032\b\022\004\022\0020\t0\f2\006\020\r\032\0020\016H@¢\006\002\020\017J\026\020\020\032\b\022\004\022\0020\0210\f2\006\020\022\032\0020\021H\024R\022\020\002\032\006\022\002\b\0030\003X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/EvaluationMatterhornStarterBase;", "Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornStarterBase;", "artifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactType;)V", "buildArtifactRequest", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "name", "", "task", "args", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadExplicitlySpecifiedPathsFromEnv", "Ljava/nio/file/Path;", "projectDir", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornStarterBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornStarterBase.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EvaluationMatterhornStarterBase\n+ 2 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,108:1\n117#2:109\n1611#3,9:110\n1863#3:119\n1864#3:121\n1620#3:122\n1#4:120\n14#5:123\n*S KotlinDebug\n*F\n+ 1 MatterhornStarterBase.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EvaluationMatterhornStarterBase\n*L\n84#1:109\n95#1:110,9\n95#1:119\n95#1:121\n95#1:122\n95#1:120\n56#1:123\n*E\n"})
/*     */ public abstract class EvaluationMatterhornStarterBase
/*     */   extends MatterhornStarterBase
/*     */ {
/*     */   public EvaluationMatterhornStarterBase(@NotNull ArtifactType<?> artifactType) {
/*  52 */     this.artifactType = artifactType;
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/EvaluationMatterhornStarterBase$Companion;", "", "<init>", "()V", "EXPLICIT_USER_PATHS", "", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {} } @NotNull
/*  56 */   public static final Companion Companion = new Companion(null); @NotNull private final ArtifactType<?> artifactType; static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(EvaluationMatterhornStarterBase.class), "getInstance(...)"); } @NotNull public static final String EXPLICIT_USER_PATHS = "EXPLICITLY_SPECIFIED_USER_PATHS_FOR_TASK"; @NotNull private static final Logger logger = Logger.getInstance(EvaluationMatterhornStarterBase.class);
/*     */   
/*     */   @NotNull
/*     */   protected List<Path> loadExplicitlySpecifiedPathsFromEnv(@NotNull Path projectDir) {
/*     */     String pathsEnv;
/*     */     Intrinsics.checkNotNullParameter(projectDir, "projectDir");
/*     */     if (System.getenv("EXPLICITLY_SPECIFIED_USER_PATHS_FOR_TASK") == null) {
/*     */       System.getenv("EXPLICITLY_SPECIFIED_USER_PATHS_FOR_TASK");
/*     */       return CollectionsKt.emptyList();
/*     */     } 
/*     */     String[] arrayOfString = new String[1];
/*     */     arrayOfString[0] = ":";
/*     */     List list1 = StringsKt.split$default(pathsEnv, arrayOfString, false, 0, 6, null);
/*     */     int $i$f$mapNotNull = 0;
/*     */     List list2 = list1;
/*     */     Collection destination$iv$iv = new ArrayList();
/*     */     int $i$f$mapNotNullTo = 0;
/*     */     Iterable $this$forEach$iv$iv$iv = list2;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*     */       int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*     */       String pathStr = (String)element$iv$iv;
/*     */       int $i$a$-mapNotNull-EvaluationMatterhornStarterBase$loadExplicitlySpecifiedPathsFromEnv$1 = 0;
/*     */     } 
/*     */     return (List<Path>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object buildArtifactRequest(@NotNull String name, @NotNull String task, @NotNull List<String> args, @NotNull RootExecutionContext context, @NotNull Continuation<? super ArtifactRequest<?, ?>> $completion) {
/*     */     return buildArtifactRequest$suspendImpl(this, name, task, args, context, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornStarterBase.kt", l = {69}, i = {0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"$this", "name", "task", "context", "project"}, m = "buildArtifactRequest$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.EvaluationMatterhornStarterBase")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EvaluationMatterhornStarterBase$buildArtifactRequest$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     EvaluationMatterhornStarterBase$buildArtifactRequest$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EvaluationMatterhornStarterBase.buildArtifactRequest$suspendImpl(EvaluationMatterhornStarterBase.this, null, null, null, null, (Continuation<? super ArtifactRequest<?, ?>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EvaluationMatterhornStarterBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */