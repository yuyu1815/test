/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistory;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Result;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.InvalidPathException;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.io.path.PathsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000´\001\n\000\n\002\020\b\n\002\b\002\n\002\020\t\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\021\n\002\030\002\n\002\030\002\n\000\032\024\020\016\032\004\030\0010\n*\0020\0172\006\020\020\032\0020\021\032\024\020\022\032\004\030\0010\n*\0020\0232\006\020\020\032\0020\021\032\f\020\024\032\004\030\0010\025*\0020\017\032m\020\035\032\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\036*\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0362;\020\037\0327\022\035\022\033\022\004\022\0020\0300\034j\002`$¢\006\f\b!\022\b\b\"\022\004\b\b(#\022\024\022\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0360 H\bø\001\000\032m\020%\032\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\036*\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0362;\020\037\0327\022\035\022\033\022\004\022\0020\0300\034j\002`$¢\006\f\b!\022\b\b\"\022\004\b\b(#\022\024\022\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0360 H\bø\001\000\032(\020&\032\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0362\b\020'\032\004\030\0010\n2\006\020(\032\0020\017\032&\020)\032\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0362\006\020*\032\0020\n2\006\020(\032\0020\017\032(\020+\032\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0362\006\020,\032\0020\n2\006\020-\032\0020\017H\002\0328\020.\032\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0362\006\020,\032\0020\n2\006\020/\032\002002\b\b\002\0201\032\00202H@¢\006\002\0203\032@\0204\032\022\022\004\022\0020\017\022\004\022\0020\0300\027j\002`\0362\006\020,\032\0020\n2\006\020/\032\002002\006\0205\032\002062\b\b\002\0201\032\00202H@¢\006\002\0207\032H\0208\032\0020\n2\006\020\020\032\0020\0212\006\020*\032\0020\0172\n\0209\032\0060\001j\002`:2\006\020;\032\0020\0012\b\b\002\020<\032\0020\n2\n\b\002\020=\032\004\030\0010>H@¢\006\002\020?\032<\0208\032\0020\n2\006\020\020\032\0020\0212\006\020*\032\0020\0172\006\020@\032\0020A2\b\b\002\020<\032\0020\n2\n\b\002\020=\032\004\030\0010>H@¢\006\002\020B\032B\0208\032\0020\n2\006\020\020\032\0020\0212\006\020*\032\0020\0172\f\020C\032\b\022\004\022\0020A0D2\b\b\002\020<\032\0020\n2\n\b\002\020=\032\004\030\0010>H@¢\006\002\020E\032D\0208\032\0020\n2\006\020,\032\0020\0252\006\020F\032\0020G2\f\020C\032\b\022\004\022\0020A0D2\b\b\002\020<\032\0020\n2\b\b\002\020H\032\0020\0012\n\b\002\020=\032\004\030\0010>\032F\020I\032\0020\n2\f\020C\032\b\022\004\022\0020A0D2\006\020F\032\0020G2\006\020,\032\0020\0252\b\b\002\020<\032\0020\n2\b\b\002\020H\032\0020\0012\n\b\002\020=\032\004\030\0010>H\002\032*\020J\032\0020\0012\n\020K\032\0060\001j\002`:2\006\020L\032\0020\0012\006\020M\032\0020\0012\006\020N\032\0020\001\032\"\020O\032\0020\n2\006\020P\032\0020\n2\b\b\002\020Q\032\0020\0012\b\b\002\020R\032\0020\001\032.\020S\032\0020\n2\n\0209\032\0060\001j\002`:2\006\020<\032\0020\n2\n\020T\032\0060\001j\002`:2\006\020F\032\0020G\032&\020U\032\b\022\004\022\0020A0D2\f\020C\032\b\022\004\022\0020A0D2\b\b\002\020H\032\0020\001H\000\032\024\020V\032\b\022\004\022\0020\n0D2\006\020W\032\0020\n\032\020\020X\032\0020\n*\0060Yj\002`ZH\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\004XT¢\006\002\n\000\"\024\020\005\032\0020\006X\004¢\006\b\n\000\022\004\b\007\020\b\"\033\020\t\032\0020\n*\b\022\004\022\0020\n0\0138F¢\006\006\032\004\b\f\020\r*\"\020\026\"\016\022\004\022\0020\017\022\004\022\0020\0300\0272\016\022\004\022\0020\017\022\004\022\0020\0300\027*\026\020\031\"\b\022\004\022\0020\0170\0322\b\022\004\022\0020\0170\032*\026\020\033\"\b\022\004\022\0020\0300\0342\b\022\004\022\0020\0300\034\002\007\n\005\b20\001¨\006["}, d2 = {"PRINT_SCREEN_MAX_CHARS_PER_LINE", "", "PRINT_SCREEN_KEEP_CHARS_FOR_TRUNCATED_LINES", "SEARCH_TIMEOUT_MS", "", "log", "Lcom/intellij/openapi/diagnostic/Logger;", "getLog$annotations", "()V", "text", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult;", "getText", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult;)Ljava/lang/String;", "relativeName", "Lcom/intellij/openapi/vfs/VirtualFile;", "project", "Lcom/intellij/openapi/project/Project;", "relativePath", "Lcom/intellij/psi/PsiFile;", "toNioPathOrNull", "Ljava/nio/file/Path;", "OpenFileResult", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType;", "OpenFileSuccess", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;", "OpenFileError", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;", "ifDoesNotExist", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileResult;", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "e", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileError;", "ifUnexpectedType", "locateDirectory", "directory", "currentDirectory", "locateFile", "file", "locateDirectoryOrFile", "path", "currentDir", "smartLocateFile", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "allowOnlyProjectFile", "", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "smartLocate", "target", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "printScreen", "startLine", "Lcom/intellij/ml/llm/matterhorn/ej/core/OneBasedIndex;", "window", "separator", "agentSessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;IILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "block", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blocks", "", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/util/List;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "document", "Lcom/intellij/openapi/editor/Document;", "codeThreshold", "printScreenImpl", "constraintStartLineNum", "lineNum", "windowSize", "bottomMargin", "totalLines", "truncateLongLine", "line", "maxLength", "keepSymbols", "printScreenPart", "endLineExcl", "mergePrintBlocks", "parseArgs", "args", "parseArgument", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/AgentUtilsKt\n+ 2 Result.kt\ncom/intellij/ml/llm/matterhorn/ej/core/ResultKt\n+ 3 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,557:1\n97#1:566\n98#1,3:569\n89#1:573\n90#1,2:576\n89#1:578\n90#1,2:581\n89#1:583\n90#1,2:586\n92#1:603\n92#1:605\n92#1:607\n79#2,4:558\n79#2,4:562\n79#2,2:567\n82#2:572\n79#2,2:574\n79#2,2:579\n79#2,2:584\n82#2:604\n82#2:606\n82#2:608\n86#2,4:609\n31#3,2:588\n1611#4,9:590\n1863#4:599\n1864#4:601\n1620#4:602\n1557#4:614\n1628#4,3:615\n1557#4:618\n1628#4,3:619\n1368#4:622\n1454#4,5:623\n1053#4:628\n1863#4,2:629\n1#5:600\n1#5:613\n58#6:631\n36#6,2:632\n*S KotlinDebug\n*F\n+ 1 AgentUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/AgentUtilsKt\n*L\n188#1:566\n188#1:569,3\n220#1:573\n220#1:576,2\n222#1:578\n222#1:581,2\n224#1:583\n224#1:586,2\n224#1:603\n222#1:605\n220#1:607\n89#1:558,4\n97#1:562,4\n188#1:567,2\n188#1:572\n220#1:574,2\n222#1:579,2\n224#1:584,2\n224#1:604\n222#1:606\n220#1:608\n261#1:609,4\n225#1:588,2\n248#1:590,9\n248#1:599\n248#1:601\n248#1:602\n341#1:614\n341#1:615,3\n374#1:618\n374#1:619,3\n449#1:622\n449#1:623,5\n455#1:628\n466#1:629,2\n248#1:600\n37#1:631\n37#1:632,2\n*E\n"})
/*     */ public final class AgentUtilsKt {
/*     */   static {
/*  37 */     int $i$f$fileLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 631 */     int $i$f$currentClassLogger = 0;
/* 632 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 633 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); log = Logger.getInstance(clazz$iv$iv);
/*     */   }
/*     */   
/*     */   public static final int PRINT_SCREEN_MAX_CHARS_PER_LINE = 2000;
/*     */   public static final int PRINT_SCREEN_KEEP_CHARS_FOR_TRUNCATED_LINES = 30;
/*     */   public static final long SEARCH_TIMEOUT_MS = 30000L;
/*     */   @NotNull
/*     */   private static final Logger log;
/*     */   
/*     */   @NotNull
/*     */   public static final String getText(@NotNull AgentResult $this$text) {
/*     */     Intrinsics.checkNotNullParameter($this$text, "<this>");
/*     */     AgentResult agentResult = $this$text;
/*     */     if (agentResult instanceof AgentResult.Success) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (agentResult instanceof AgentResult.Failure) ? ((AgentResult.Failure)$this$text).getText() : "JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final String relativeName(@NotNull VirtualFile $this$relativeName, @NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter($this$relativeName, "<this>");
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNull(project.getBasePath());
/*     */     Intrinsics.checkNotNullExpressionValue(Path.of(project.getBasePath(), new String[0]), "of(...)");
/*     */     PathsKt.relativeToOrNull(VirtualFileUtil.toNioPathOrNull($this$relativeName), Path.of(project.getBasePath(), new String[0]));
/*     */     String relativePath = (VirtualFileUtil.toNioPathOrNull($this$relativeName) != null && PathsKt.relativeToOrNull(VirtualFileUtil.toNioPathOrNull($this$relativeName), Path.of(project.getBasePath(), new String[0])) != null) ? PathsKt.relativeToOrNull(VirtualFileUtil.toNioPathOrNull($this$relativeName), Path.of(project.getBasePath(), new String[0])).toString() : null;
/*     */     return ((relativePath != null) ? ((StringsKt.startsWith$default(relativePath, "..", false, 2, null) == true)) : false) ? null : relativePath;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final String relativePath(@NotNull PsiFile $this$relativePath, @NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter($this$relativePath, "<this>");
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullExpressionValue($this$relativePath.getVirtualFile(), "getVirtualFile(...)");
/*     */     return relativeName($this$relativePath.getVirtualFile(), project);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Path toNioPathOrNull(@NotNull VirtualFile $this$toNioPathOrNull) {
/*     */     Path path;
/*     */     Intrinsics.checkNotNullParameter($this$toNioPathOrNull, "<this>");
/*     */     try {
/*     */       path = $this$toNioPathOrNull.toNioPath();
/*     */     } catch (UnsupportedOperationException <unused var>) {
/*     */       path = null;
/*     */     } 
/*     */     return path;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Result<VirtualFile, OpenFileErrorType> ifDoesNotExist(@NotNull Result<VirtualFile, OpenFileErrorType> $this$ifDoesNotExist, @NotNull Function1 action) {
/*     */     Intrinsics.checkNotNullParameter($this$ifDoesNotExist, "<this>");
/*     */     Intrinsics.checkNotNullParameter(action, "action");
/*     */     int $i$f$ifDoesNotExist = 0;
/*     */     Result<VirtualFile, OpenFileErrorType> $this$ifError$iv = $this$ifDoesNotExist;
/*     */     int $i$f$ifError = 0;
/*     */     if ($this$ifError$iv instanceof Result.Err) {
/*     */       Result.Err it = (Result.Err)$this$ifError$iv;
/*     */       int $i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1 = 0;
/*     */       if (it.getError() == OpenFileErrorType.doesNotExist)
/*     */         return (Result<VirtualFile, OpenFileErrorType>)action.invoke(it); 
/*     */     } 
/*     */     return $this$ifError$iv;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Result<VirtualFile, OpenFileErrorType> ifUnexpectedType(@NotNull Result<VirtualFile, OpenFileErrorType> $this$ifUnexpectedType, @NotNull Function1 action) {
/*     */     Intrinsics.checkNotNullParameter($this$ifUnexpectedType, "<this>");
/*     */     Intrinsics.checkNotNullParameter(action, "action");
/*     */     int $i$f$ifUnexpectedType = 0;
/*     */     Result<VirtualFile, OpenFileErrorType> $this$ifError$iv = $this$ifUnexpectedType;
/*     */     int $i$f$ifError = 0;
/*     */     if ($this$ifError$iv instanceof Result.Err) {
/*     */       Result.Err it = (Result.Err)$this$ifError$iv;
/*     */       int $i$a$-ifError-AgentUtilsKt$ifUnexpectedType$1 = 0;
/*     */       if (it.getError() == OpenFileErrorType.unexpectedType)
/*     */         return (Result<VirtualFile, OpenFileErrorType>)action.invoke(it); 
/*     */     } 
/*     */     return $this$ifError$iv;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Result<VirtualFile, OpenFileErrorType> locateDirectory(@Nullable String directory, @NotNull VirtualFile currentDirectory) {
/*     */     Path path1;
/*     */     Intrinsics.checkNotNullParameter(currentDirectory, "currentDirectory");
/*     */     try {
/*     */       Intrinsics.checkNotNullExpressionValue(Paths.get(directory, new String[0]), "get(...)");
/*     */       path1 = Paths.get(directory, new String[0]);
/*     */     } catch (InvalidPathException th) {
/*     */       log.warn(th);
/*     */       return (Result<VirtualFile, OpenFileErrorType>)new Result.Err(OpenFileErrorType.doesNotExist, "ERROR: Invalid path: \"" + directory + "\"");
/*     */     } 
/*     */     Path resolvedDirectory = path1;
/*     */     Path resolvedAbsoluteDirectory = !resolvedDirectory.isAbsolute() ? currentDirectory.toNioPath().resolve(resolvedDirectory) : resolvedDirectory;
/*     */     if (!Files.exists(resolvedAbsoluteDirectory, new java.nio.file.LinkOption[0]))
/*     */       return (Result<VirtualFile, OpenFileErrorType>)new Result.Err(OpenFileErrorType.doesNotExist, "ERROR: Path does not exist: \"" + resolvedAbsoluteDirectory + "\""); 
/*     */     VirtualFile file = VfsUtil.findFile(resolvedAbsoluteDirectory, true);
/*     */     if (file == null)
/*     */       return (Result<VirtualFile, OpenFileErrorType>)new Result.Err(OpenFileErrorType.doesNotExist, "ERROR: Path does not exist: \"" + resolvedAbsoluteDirectory + "\""); 
/*     */     if (!file.isDirectory())
/*     */       return (Result<VirtualFile, OpenFileErrorType>)new Result.Err(OpenFileErrorType.unexpectedType, "ERROR: File is not a directory"); 
/*     */     return (directory != null) ? (Result<VirtualFile, OpenFileErrorType>)new Result.Ok(file) : (Result<VirtualFile, OpenFileErrorType>)new Result.Ok(currentDirectory);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Result<VirtualFile, OpenFileErrorType> locateFile(@NotNull String file, @NotNull VirtualFile currentDirectory) {
/*     */     Path path1;
/*     */     Intrinsics.checkNotNullParameter(file, "file");
/*     */     Intrinsics.checkNotNullParameter(currentDirectory, "currentDirectory");
/*     */     try {
/*     */       Intrinsics.checkNotNullExpressionValue(Paths.get(file, new String[0]), "get(...)");
/*     */       path1 = Paths.get(file, new String[0]);
/*     */     } catch (InvalidPathException th) {
/*     */       log.warn(th);
/*     */       return (Result<VirtualFile, OpenFileErrorType>)new Result.Err(OpenFileErrorType.doesNotExist, "ERROR: Invalid path: \"" + file + "\"");
/*     */     } 
/*     */     Path resolvedFile = path1;
/*     */     Path resolvedAbsoluteFile = !resolvedFile.isAbsolute() ? currentDirectory.toNioPath().resolve(resolvedFile) : resolvedFile;
/*     */     if (!Files.exists(resolvedAbsoluteFile, new java.nio.file.LinkOption[0]))
/*     */       return (Result<VirtualFile, OpenFileErrorType>)new Result.Err(OpenFileErrorType.doesNotExist, "ERROR: Path does not exist: \"" + resolvedAbsoluteFile + "\""); 
/*     */     VirtualFile virtualFile = VfsUtil.findFile(resolvedAbsoluteFile, true);
/*     */     if (virtualFile == null)
/*     */       return (Result<VirtualFile, OpenFileErrorType>)new Result.Err(OpenFileErrorType.doesNotExist, "ERROR: File does not exist: \"" + resolvedAbsoluteFile + "\""); 
/*     */     if (!VirtualFileUtil.isFile(virtualFile))
/*     */       return (Result<VirtualFile, OpenFileErrorType>)new Result.Err(OpenFileErrorType.unexpectedType, "ERROR: Path is a directory, not a file: \"" + resolvedAbsoluteFile + "\""); 
/*     */     return (Result<VirtualFile, OpenFileErrorType>)new Result.Ok(virtualFile);
/*     */   }
/*     */   
/*     */   private static final Result<VirtualFile, OpenFileErrorType> locateDirectoryOrFile(String path, VirtualFile currentDir) {
/*     */     Result<VirtualFile, OpenFileErrorType> $this$ifUnexpectedType$iv = locateDirectory(path, currentDir);
/*     */     int $i$f$ifUnexpectedType = 0;
/*     */     Result<VirtualFile, OpenFileErrorType> $this$ifError$iv$iv = $this$ifUnexpectedType$iv;
/*     */     int $i$f$ifError = 0;
/*     */     if ($this$ifError$iv$iv instanceof Result.Err) {
/*     */       Result.Err it$iv = (Result.Err)$this$ifError$iv$iv;
/*     */       int $i$a$-ifError-AgentUtilsKt$ifUnexpectedType$1$iv = 0;
/*     */       if (it$iv.getError() == OpenFileErrorType.unexpectedType) {
/*     */         Result.Err it = it$iv;
/*     */         int $i$a$-ifUnexpectedType-AgentUtilsKt$locateDirectoryOrFile$1 = 0;
/*     */       } 
/*     */     } else {
/*     */     
/*     */     } 
/*     */     return $this$ifError$iv$iv;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object smartLocateFile(@NotNull String path, @NotNull ExecutionAgentContext context, boolean allowOnlyProjectFile, @NotNull Continuation<? super Result<? extends VirtualFile, ? extends OpenFileErrorType>> $completion) {
/*     */     return smartLocate(path, context, LocateTarget.File, allowOnlyProjectFile, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object smartLocate(@NotNull String path, @NotNull ExecutionAgentContext context, @NotNull LocateTarget target, boolean allowOnlyProjectFile, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/AgentUtilsKt$smartLocate$1
/*     */     //   5: ifeq -> 43
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/AgentUtilsKt$smartLocate$1
/*     */     //   13: astore #50
/*     */     //   15: aload #50
/*     */     //   17: getfield label : I
/*     */     //   20: ldc_w -2147483648
/*     */     //   23: iand
/*     */     //   24: ifeq -> 43
/*     */     //   27: aload #50
/*     */     //   29: dup
/*     */     //   30: getfield label : I
/*     */     //   33: ldc_w -2147483648
/*     */     //   36: isub
/*     */     //   37: putfield label : I
/*     */     //   40: goto -> 54
/*     */     //   43: new com/intellij/ml/llm/matterhorn/ej/core/actions/AgentUtilsKt$smartLocate$1
/*     */     //   46: dup
/*     */     //   47: aload #4
/*     */     //   49: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   52: astore #50
/*     */     //   54: aload #50
/*     */     //   56: getfield result : Ljava/lang/Object;
/*     */     //   59: astore #49
/*     */     //   61: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   64: astore #51
/*     */     //   66: aload #50
/*     */     //   68: getfield label : I
/*     */     //   71: tableswitch default -> 1391, 0 -> 96, 1 -> 495, 2 -> 710
/*     */     //   96: aload #49
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_2
/*     */     //   102: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;)Lkotlin/jvm/functions/Function2;
/*     */     //   107: astore #5
/*     */     //   109: aload #5
/*     */     //   111: aload_0
/*     */     //   112: aload_1
/*     */     //   113: invokeinterface getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   118: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   123: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   126: astore #6
/*     */     //   128: iconst_0
/*     */     //   129: istore #7
/*     */     //   131: aload #6
/*     */     //   133: astore #8
/*     */     //   135: iconst_0
/*     */     //   136: istore #9
/*     */     //   138: aload #8
/*     */     //   140: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   143: ifeq -> 1197
/*     */     //   146: aload #8
/*     */     //   148: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   151: astore #10
/*     */     //   153: iconst_0
/*     */     //   154: istore #11
/*     */     //   156: aload #10
/*     */     //   158: invokevirtual getError : ()Ljava/lang/Object;
/*     */     //   161: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType.doesNotExist : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType;
/*     */     //   164: if_acmpne -> 1189
/*     */     //   167: nop
/*     */     //   168: iconst_0
/*     */     //   169: istore #12
/*     */     //   171: aload #5
/*     */     //   173: aload_0
/*     */     //   174: aload_1
/*     */     //   175: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   180: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   185: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   188: astore #13
/*     */     //   190: iconst_0
/*     */     //   191: istore #14
/*     */     //   193: aload #13
/*     */     //   195: astore #15
/*     */     //   197: iconst_0
/*     */     //   198: istore #16
/*     */     //   200: aload #15
/*     */     //   202: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   205: ifeq -> 1182
/*     */     //   208: aload #15
/*     */     //   210: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   213: astore #17
/*     */     //   215: iconst_0
/*     */     //   216: istore #18
/*     */     //   218: aload #17
/*     */     //   220: invokevirtual getError : ()Ljava/lang/Object;
/*     */     //   223: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType.doesNotExist : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType;
/*     */     //   226: if_acmpne -> 1174
/*     */     //   229: nop
/*     */     //   230: iconst_0
/*     */     //   231: istore #19
/*     */     //   233: aload #5
/*     */     //   235: aload_0
/*     */     //   236: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   241: aload_1
/*     */     //   242: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   247: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   252: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   255: astore #20
/*     */     //   257: iconst_0
/*     */     //   258: istore #21
/*     */     //   260: aload #20
/*     */     //   262: astore #22
/*     */     //   264: iconst_0
/*     */     //   265: istore #23
/*     */     //   267: aload #22
/*     */     //   269: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   272: ifeq -> 1167
/*     */     //   275: aload #22
/*     */     //   277: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   280: astore #24
/*     */     //   282: iconst_0
/*     */     //   283: istore #25
/*     */     //   285: aload #24
/*     */     //   287: invokevirtual getError : ()Ljava/lang/Object;
/*     */     //   290: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType.doesNotExist : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType;
/*     */     //   293: if_acmpne -> 1159
/*     */     //   296: nop
/*     */     //   297: iconst_0
/*     */     //   298: istore #26
/*     */     //   300: aload_1
/*     */     //   301: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   306: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   309: astore #27
/*     */     //   311: iconst_0
/*     */     //   312: istore #28
/*     */     //   314: ldc_w com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService
/*     */     //   317: astore #29
/*     */     //   319: aload #27
/*     */     //   321: aload #29
/*     */     //   323: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   328: dup
/*     */     //   329: ifnonnull -> 341
/*     */     //   332: pop
/*     */     //   333: aload #27
/*     */     //   335: aload #29
/*     */     //   337: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   340: athrow
/*     */     //   341: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService
/*     */     //   344: astore #30
/*     */     //   346: aload_0
/*     */     //   347: astore #28
/*     */     //   349: aload_0
/*     */     //   350: checkcast java/lang/CharSequence
/*     */     //   353: getstatic java/io/File.separator : Ljava/lang/String;
/*     */     //   356: dup
/*     */     //   357: ldc_w 'separator'
/*     */     //   360: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   363: iconst_0
/*     */     //   364: iconst_0
/*     */     //   365: bipush #6
/*     */     //   367: aconst_null
/*     */     //   368: invokestatic lastIndexOf$default : (Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I
/*     */     //   371: iconst_1
/*     */     //   372: iadd
/*     */     //   373: istore #29
/*     */     //   375: aload #28
/*     */     //   377: iload #29
/*     */     //   379: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   382: dup
/*     */     //   383: ldc_w 'substring(...)'
/*     */     //   386: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   389: astore #27
/*     */     //   391: aload_2
/*     */     //   392: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget.File : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   395: if_acmpne -> 404
/*     */     //   398: getstatic com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType.FILES : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;
/*     */     //   401: goto -> 407
/*     */     //   404: getstatic com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType.FILES_OR_DIRECTORIES : Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;
/*     */     //   407: astore #28
/*     */     //   409: aload #30
/*     */     //   411: new com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*     */     //   414: dup
/*     */     //   415: aload_0
/*     */     //   416: bipush #10
/*     */     //   418: ldc2_w 30000
/*     */     //   421: aconst_null
/*     */     //   422: bipush #8
/*     */     //   424: aconst_null
/*     */     //   425: invokespecial <init> : (Ljava/lang/String;IJLcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   428: aload #28
/*     */     //   430: aload #50
/*     */     //   432: aload #50
/*     */     //   434: aload_0
/*     */     //   435: putfield L$0 : Ljava/lang/Object;
/*     */     //   438: aload #50
/*     */     //   440: aload_1
/*     */     //   441: putfield L$1 : Ljava/lang/Object;
/*     */     //   444: aload #50
/*     */     //   446: aload_2
/*     */     //   447: putfield L$2 : Ljava/lang/Object;
/*     */     //   450: aload #50
/*     */     //   452: aload #27
/*     */     //   454: putfield L$3 : Ljava/lang/Object;
/*     */     //   457: aload #50
/*     */     //   459: aload #28
/*     */     //   461: putfield L$4 : Ljava/lang/Object;
/*     */     //   464: aload #50
/*     */     //   466: aload #30
/*     */     //   468: putfield L$5 : Ljava/lang/Object;
/*     */     //   471: aload #50
/*     */     //   473: iload_3
/*     */     //   474: putfield Z$0 : Z
/*     */     //   477: aload #50
/*     */     //   479: iconst_1
/*     */     //   480: putfield label : I
/*     */     //   483: invokevirtual search : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   486: dup
/*     */     //   487: aload #51
/*     */     //   489: if_acmpne -> 601
/*     */     //   492: aload #51
/*     */     //   494: areturn
/*     */     //   495: iconst_0
/*     */     //   496: istore #7
/*     */     //   498: iconst_0
/*     */     //   499: istore #9
/*     */     //   501: iconst_0
/*     */     //   502: istore #11
/*     */     //   504: iconst_0
/*     */     //   505: istore #12
/*     */     //   507: iconst_0
/*     */     //   508: istore #14
/*     */     //   510: iconst_0
/*     */     //   511: istore #16
/*     */     //   513: iconst_0
/*     */     //   514: istore #18
/*     */     //   516: iconst_0
/*     */     //   517: istore #19
/*     */     //   519: iconst_0
/*     */     //   520: istore #21
/*     */     //   522: iconst_0
/*     */     //   523: istore #23
/*     */     //   525: iconst_0
/*     */     //   526: istore #25
/*     */     //   528: iconst_0
/*     */     //   529: istore #26
/*     */     //   531: aload #50
/*     */     //   533: getfield Z$0 : Z
/*     */     //   536: istore_3
/*     */     //   537: aload #50
/*     */     //   539: getfield L$5 : Ljava/lang/Object;
/*     */     //   542: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService
/*     */     //   545: astore #30
/*     */     //   547: aload #50
/*     */     //   549: getfield L$4 : Ljava/lang/Object;
/*     */     //   552: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType
/*     */     //   555: astore #28
/*     */     //   557: aload #50
/*     */     //   559: getfield L$3 : Ljava/lang/Object;
/*     */     //   562: checkcast java/lang/String
/*     */     //   565: astore #27
/*     */     //   567: aload #50
/*     */     //   569: getfield L$2 : Ljava/lang/Object;
/*     */     //   572: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget
/*     */     //   575: astore_2
/*     */     //   576: aload #50
/*     */     //   578: getfield L$1 : Ljava/lang/Object;
/*     */     //   581: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   584: astore_1
/*     */     //   585: aload #50
/*     */     //   587: getfield L$0 : Ljava/lang/Object;
/*     */     //   590: checkcast java/lang/String
/*     */     //   593: astore_0
/*     */     //   594: aload #49
/*     */     //   596: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   599: aload #49
/*     */     //   601: checkcast java/util/List
/*     */     //   604: astore #29
/*     */     //   606: aload #29
/*     */     //   608: invokeinterface isEmpty : ()Z
/*     */     //   613: ifeq -> 801
/*     */     //   616: aload #27
/*     */     //   618: aload_0
/*     */     //   619: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   622: ifne -> 801
/*     */     //   625: aload #30
/*     */     //   627: new com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery
/*     */     //   630: dup
/*     */     //   631: aload #27
/*     */     //   633: bipush #10
/*     */     //   635: ldc2_w 30000
/*     */     //   638: aconst_null
/*     */     //   639: bipush #8
/*     */     //   641: aconst_null
/*     */     //   642: invokespecial <init> : (Ljava/lang/String;IJLcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   645: aload #28
/*     */     //   647: aload #50
/*     */     //   649: aload #50
/*     */     //   651: aload_0
/*     */     //   652: putfield L$0 : Ljava/lang/Object;
/*     */     //   655: aload #50
/*     */     //   657: aload_1
/*     */     //   658: putfield L$1 : Ljava/lang/Object;
/*     */     //   661: aload #50
/*     */     //   663: aload_2
/*     */     //   664: putfield L$2 : Ljava/lang/Object;
/*     */     //   667: aload #50
/*     */     //   669: aload #27
/*     */     //   671: putfield L$3 : Ljava/lang/Object;
/*     */     //   674: aload #50
/*     */     //   676: aconst_null
/*     */     //   677: putfield L$4 : Ljava/lang/Object;
/*     */     //   680: aload #50
/*     */     //   682: aconst_null
/*     */     //   683: putfield L$5 : Ljava/lang/Object;
/*     */     //   686: aload #50
/*     */     //   688: iload_3
/*     */     //   689: putfield Z$0 : Z
/*     */     //   692: aload #50
/*     */     //   694: iconst_2
/*     */     //   695: putfield label : I
/*     */     //   698: invokevirtual search : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   701: dup
/*     */     //   702: aload #51
/*     */     //   704: if_acmpne -> 796
/*     */     //   707: aload #51
/*     */     //   709: areturn
/*     */     //   710: iconst_0
/*     */     //   711: istore #7
/*     */     //   713: iconst_0
/*     */     //   714: istore #9
/*     */     //   716: iconst_0
/*     */     //   717: istore #11
/*     */     //   719: iconst_0
/*     */     //   720: istore #12
/*     */     //   722: iconst_0
/*     */     //   723: istore #14
/*     */     //   725: iconst_0
/*     */     //   726: istore #16
/*     */     //   728: iconst_0
/*     */     //   729: istore #18
/*     */     //   731: iconst_0
/*     */     //   732: istore #19
/*     */     //   734: iconst_0
/*     */     //   735: istore #21
/*     */     //   737: iconst_0
/*     */     //   738: istore #23
/*     */     //   740: iconst_0
/*     */     //   741: istore #25
/*     */     //   743: iconst_0
/*     */     //   744: istore #26
/*     */     //   746: aload #50
/*     */     //   748: getfield Z$0 : Z
/*     */     //   751: istore_3
/*     */     //   752: aload #50
/*     */     //   754: getfield L$3 : Ljava/lang/Object;
/*     */     //   757: checkcast java/lang/String
/*     */     //   760: astore #27
/*     */     //   762: aload #50
/*     */     //   764: getfield L$2 : Ljava/lang/Object;
/*     */     //   767: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget
/*     */     //   770: astore_2
/*     */     //   771: aload #50
/*     */     //   773: getfield L$1 : Ljava/lang/Object;
/*     */     //   776: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   779: astore_1
/*     */     //   780: aload #50
/*     */     //   782: getfield L$0 : Ljava/lang/Object;
/*     */     //   785: checkcast java/lang/String
/*     */     //   788: astore_0
/*     */     //   789: aload #49
/*     */     //   791: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   794: aload #49
/*     */     //   796: checkcast java/util/List
/*     */     //   799: astore #29
/*     */     //   801: aload_1
/*     */     //   802: invokeinterface getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   807: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   810: dup
/*     */     //   811: ldc_w 'toNioPath(...)'
/*     */     //   814: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   817: astore #32
/*     */     //   819: new java/lang/StringBuilder
/*     */     //   822: dup
/*     */     //   823: invokespecial <init> : ()V
/*     */     //   826: astore #31
/*     */     //   828: aload #31
/*     */     //   830: aload_2
/*     */     //   831: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   834: invokestatic capitalize : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   837: aload_0
/*     */     //   838: aload #32
/*     */     //   840: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   845: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   848: dup
/*     */     //   849: ldc_w 'append(...)'
/*     */     //   852: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   855: bipush #10
/*     */     //   857: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   860: dup
/*     */     //   861: ldc_w 'append(...)'
/*     */     //   864: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   867: pop
/*     */     //   868: aload #29
/*     */     //   870: checkcast java/util/Collection
/*     */     //   873: invokeinterface isEmpty : ()Z
/*     */     //   878: ifne -> 885
/*     */     //   881: iconst_1
/*     */     //   882: goto -> 886
/*     */     //   885: iconst_0
/*     */     //   886: ifeq -> 1095
/*     */     //   889: aload #31
/*     */     //   891: ldc_w 'Possible candidates:'
/*     */     //   894: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   897: dup
/*     */     //   898: ldc_w 'append(...)'
/*     */     //   901: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   904: bipush #10
/*     */     //   906: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   909: dup
/*     */     //   910: ldc_w 'append(...)'
/*     */     //   913: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   916: pop
/*     */     //   917: aload #29
/*     */     //   919: checkcast java/lang/Iterable
/*     */     //   922: astore #33
/*     */     //   924: iconst_0
/*     */     //   925: istore #34
/*     */     //   927: aload #33
/*     */     //   929: astore #35
/*     */     //   931: new java/util/ArrayList
/*     */     //   934: dup
/*     */     //   935: invokespecial <init> : ()V
/*     */     //   938: checkcast java/util/Collection
/*     */     //   941: astore #36
/*     */     //   943: iconst_0
/*     */     //   944: istore #37
/*     */     //   946: aload #35
/*     */     //   948: astore #38
/*     */     //   950: iconst_0
/*     */     //   951: istore #39
/*     */     //   953: aload #38
/*     */     //   955: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   960: astore #40
/*     */     //   962: aload #40
/*     */     //   964: invokeinterface hasNext : ()Z
/*     */     //   969: ifeq -> 1032
/*     */     //   972: aload #40
/*     */     //   974: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   979: astore #41
/*     */     //   981: aload #41
/*     */     //   983: astore #42
/*     */     //   985: iconst_0
/*     */     //   986: istore #43
/*     */     //   988: aload #42
/*     */     //   990: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem
/*     */     //   993: astore #44
/*     */     //   995: iconst_0
/*     */     //   996: istore #45
/*     */     //   998: aload #44
/*     */     //   1000: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   1003: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   1006: dup
/*     */     //   1007: ifnull -> 1028
/*     */     //   1010: astore #46
/*     */     //   1012: iconst_0
/*     */     //   1013: istore #47
/*     */     //   1015: aload #36
/*     */     //   1017: aload #46
/*     */     //   1019: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1024: pop
/*     */     //   1025: goto -> 1029
/*     */     //   1028: pop
/*     */     //   1029: goto -> 962
/*     */     //   1032: nop
/*     */     //   1033: aload #36
/*     */     //   1035: checkcast java/util/List
/*     */     //   1038: nop
/*     */     //   1039: checkcast java/lang/Iterable
/*     */     //   1042: ldc_w '\\n'
/*     */     //   1045: checkcast java/lang/CharSequence
/*     */     //   1048: aconst_null
/*     */     //   1049: aconst_null
/*     */     //   1050: iconst_0
/*     */     //   1051: aconst_null
/*     */     //   1052: aload_1
/*     */     //   1053: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)Lkotlin/jvm/functions/Function1;
/*     */     //   1058: bipush #30
/*     */     //   1060: aconst_null
/*     */     //   1061: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1064: astore #48
/*     */     //   1066: aload #31
/*     */     //   1068: aload #48
/*     */     //   1070: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1073: dup
/*     */     //   1074: ldc_w 'append(...)'
/*     */     //   1077: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1080: bipush #10
/*     */     //   1082: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1085: dup
/*     */     //   1086: ldc_w 'append(...)'
/*     */     //   1089: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1092: goto -> 1130
/*     */     //   1095: aload #31
/*     */     //   1097: aload_2
/*     */     //   1098: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   1101: aload #27
/*     */     //   1103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1111: dup
/*     */     //   1112: ldc_w 'append(...)'
/*     */     //   1115: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1118: bipush #10
/*     */     //   1120: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1123: dup
/*     */     //   1124: ldc_w 'append(...)'
/*     */     //   1127: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1130: pop
/*     */     //   1131: new com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   1134: dup
/*     */     //   1135: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType.doesNotExist : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType;
/*     */     //   1138: aload #31
/*     */     //   1140: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1143: dup
/*     */     //   1144: ldc_w 'toString(...)'
/*     */     //   1147: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1150: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1153: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   1156: goto -> 1170
/*     */     //   1159: aload #24
/*     */     //   1161: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   1164: goto -> 1170
/*     */     //   1167: aload #22
/*     */     //   1169: nop
/*     */     //   1170: nop
/*     */     //   1171: goto -> 1185
/*     */     //   1174: aload #17
/*     */     //   1176: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   1179: goto -> 1185
/*     */     //   1182: aload #15
/*     */     //   1184: nop
/*     */     //   1185: nop
/*     */     //   1186: goto -> 1200
/*     */     //   1189: aload #10
/*     */     //   1191: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   1194: goto -> 1200
/*     */     //   1197: aload #8
/*     */     //   1199: nop
/*     */     //   1200: astore #6
/*     */     //   1202: iconst_0
/*     */     //   1203: istore #7
/*     */     //   1205: aload #6
/*     */     //   1207: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   1210: ifeq -> 1388
/*     */     //   1213: aload #6
/*     */     //   1215: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   1218: astore #8
/*     */     //   1220: iconst_0
/*     */     //   1221: istore #9
/*     */     //   1223: iload_3
/*     */     //   1224: ifeq -> 1379
/*     */     //   1227: aload #8
/*     */     //   1229: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   1232: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   1235: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   1238: dup
/*     */     //   1239: ifnull -> 1268
/*     */     //   1242: aload_1
/*     */     //   1243: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   1248: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   1251: invokeinterface startsWith : (Ljava/nio/file/Path;)Z
/*     */     //   1256: iconst_1
/*     */     //   1257: if_icmpne -> 1264
/*     */     //   1260: iconst_1
/*     */     //   1261: goto -> 1270
/*     */     //   1264: iconst_0
/*     */     //   1265: goto -> 1270
/*     */     //   1268: pop
/*     */     //   1269: iconst_0
/*     */     //   1270: ifne -> 1379
/*     */     //   1273: new java/lang/StringBuilder
/*     */     //   1276: dup
/*     */     //   1277: invokespecial <init> : ()V
/*     */     //   1280: astore #10
/*     */     //   1282: aload #10
/*     */     //   1284: aload #8
/*     */     //   1286: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   1289: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   1292: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   1295: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   1300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1303: dup
/*     */     //   1304: ldc_w 'append(...)'
/*     */     //   1307: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1310: bipush #10
/*     */     //   1312: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1315: dup
/*     */     //   1316: ldc_w 'append(...)'
/*     */     //   1319: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1322: pop
/*     */     //   1323: aload #10
/*     */     //   1325: ldc_w 'Correct your path to be inside the current project or provide a relative path.'
/*     */     //   1328: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1331: dup
/*     */     //   1332: ldc_w 'append(...)'
/*     */     //   1335: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1338: bipush #10
/*     */     //   1340: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1343: dup
/*     */     //   1344: ldc_w 'append(...)'
/*     */     //   1347: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1350: pop
/*     */     //   1351: new com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   1354: dup
/*     */     //   1355: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType.outsideOfProject : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileErrorType;
/*     */     //   1358: aload #10
/*     */     //   1360: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1363: dup
/*     */     //   1364: ldc_w 'toString(...)'
/*     */     //   1367: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1370: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1373: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   1376: goto -> 1384
/*     */     //   1379: aload #8
/*     */     //   1381: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   1384: nop
/*     */     //   1385: goto -> 1390
/*     */     //   1388: aload #6
/*     */     //   1390: areturn
/*     */     //   1391: new java/lang/IllegalStateException
/*     */     //   1394: dup
/*     */     //   1395: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1398: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1401: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #205	-> 64
/*     */     //   #211	-> 101
/*     */     //   #220	-> 109
/*     */     //   #573	-> 131
/*     */     //   #574	-> 138
/*     */     //   #575	-> 146
/*     */     //   #576	-> 156
/*     */     //   #577	-> 167
/*     */     //   #222	-> 171
/*     */     //   #578	-> 193
/*     */     //   #579	-> 200
/*     */     //   #580	-> 208
/*     */     //   #581	-> 218
/*     */     //   #582	-> 229
/*     */     //   #224	-> 233
/*     */     //   #583	-> 260
/*     */     //   #584	-> 267
/*     */     //   #585	-> 275
/*     */     //   #586	-> 285
/*     */     //   #587	-> 296
/*     */     //   #225	-> 300
/*     */     //   #588	-> 314
/*     */     //   #589	-> 319
/*     */     //   #225	-> 341
/*     */     //   #226	-> 346
/*     */     //   #226	-> 389
/*     */     //   #228	-> 391
/*     */     //   #229	-> 398
/*     */     //   #231	-> 404
/*     */     //   #228	-> 407
/*     */     //   #234	-> 409
/*     */     //   #205	-> 492
/*     */     //   #233	-> 604
/*     */     //   #235	-> 606
/*     */     //   #236	-> 616
/*     */     //   #237	-> 625
/*     */     //   #238	-> 627
/*     */     //   #239	-> 645
/*     */     //   #237	-> 649
/*     */     //   #205	-> 707
/*     */     //   #242	-> 801
/*     */     //   #243	-> 819
/*     */     //   #244	-> 828
/*     */     //   #245	-> 868
/*     */     //   #245	-> 886
/*     */     //   #246	-> 889
/*     */     //   #248	-> 917
/*     */     //   #590	-> 927
/*     */     //   #598	-> 946
/*     */     //   #599	-> 953
/*     */     //   #598	-> 988
/*     */     //   #248	-> 998
/*     */     //   #598	-> 1006
/*     */     //   #600	-> 1012
/*     */     //   #598	-> 1015
/*     */     //   #598	-> 1025
/*     */     //   #598	-> 1028
/*     */     //   #599	-> 1029
/*     */     //   #601	-> 1032
/*     */     //   #602	-> 1033
/*     */     //   #590	-> 1038
/*     */     //   #248	-> 1042
/*     */     //   #253	-> 1066
/*     */     //   #255	-> 1095
/*     */     //   #258	-> 1131
/*     */     //   #587	-> 1156
/*     */     //   #603	-> 1159
/*     */     //   #604	-> 1167
/*     */     //   #583	-> 1169
/*     */     //   #259	-> 1170
/*     */     //   #582	-> 1171
/*     */     //   #605	-> 1174
/*     */     //   #606	-> 1182
/*     */     //   #578	-> 1184
/*     */     //   #260	-> 1185
/*     */     //   #577	-> 1186
/*     */     //   #607	-> 1189
/*     */     //   #608	-> 1197
/*     */     //   #573	-> 1199
/*     */     //   #261	-> 1202
/*     */     //   #609	-> 1205
/*     */     //   #610	-> 1213
/*     */     //   #262	-> 1223
/*     */     //   #263	-> 1273
/*     */     //   #264	-> 1282
/*     */     //   #265	-> 1323
/*     */     //   #266	-> 1351
/*     */     //   #268	-> 1379
/*     */     //   #269	-> 1384
/*     */     //   #610	-> 1385
/*     */     //   #612	-> 1388
/*     */     //   #220	-> 1390
/*     */     //   #205	-> 1391
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	240	0	path	Ljava/lang/String;
/*     */     //   341	154	0	path	Ljava/lang/String;
/*     */     //   594	116	0	path	Ljava/lang/String;
/*     */     //   789	78	0	path	Ljava/lang/String;
/*     */     //   101	240	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   341	154	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   585	125	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   780	406	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1186	3	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1189	8	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1197	3	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1200	64	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	240	2	target	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   341	154	2	target	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   576	134	2	target	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   771	118	2	target	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   1095	35	2	target	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   101	240	3	allowOnlyProjectFile	Z
/*     */     //   341	154	3	allowOnlyProjectFile	Z
/*     */     //   537	173	3	allowOnlyProjectFile	Z
/*     */     //   752	434	3	allowOnlyProjectFile	Z
/*     */     //   1186	3	3	allowOnlyProjectFile	Z
/*     */     //   1189	8	3	allowOnlyProjectFile	Z
/*     */     //   1197	3	3	allowOnlyProjectFile	Z
/*     */     //   1200	64	3	allowOnlyProjectFile	Z
/*     */     //   109	148	5	locator	Lkotlin/jvm/functions/Function2;
/*     */     //   128	7	6	$this$ifDoesNotExist$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   1202	18	6	$this$ifSuccess$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   1388	2	6	$this$ifSuccess$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   135	18	8	$this$ifError$iv$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   1197	2	8	$this$ifError$iv$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   1220	102	8	it	Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;
/*     */     //   1379	5	8	it	Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;
/*     */     //   153	15	10	it$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   1189	8	10	it$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   1282	91	10	result	Ljava/lang/StringBuilder;
/*     */     //   190	7	13	$this$ifDoesNotExist$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   197	18	15	$this$ifError$iv$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   1182	2	15	$this$ifError$iv$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   215	15	17	it$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   1174	8	17	it$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   257	7	20	$this$ifDoesNotExist$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   264	18	22	$this$ifError$iv$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   1167	2	22	$this$ifError$iv$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   282	15	24	it$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   1159	8	24	it$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   311	30	27	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   391	104	27	fileName	Ljava/lang/String;
/*     */     //   567	143	27	fileName	Ljava/lang/String;
/*     */     //   762	127	27	fileName	Ljava/lang/String;
/*     */     //   1095	35	27	fileName	Ljava/lang/String;
/*     */     //   409	86	28	searchType	Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;
/*     */     //   557	92	28	searchType	Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;
/*     */     //   319	22	29	serviceClass$iv	Ljava/lang/Class;
/*     */     //   606	19	29	candidates	Ljava/util/List;
/*     */     //   801	123	29	candidates	Ljava/util/List;
/*     */     //   346	149	30	searchEverywhere	Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;
/*     */     //   547	80	30	searchEverywhere	Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;
/*     */     //   828	328	31	result	Ljava/lang/StringBuilder;
/*     */     //   819	48	32	currentDirPath	Ljava/nio/file/Path;
/*     */     //   924	19	33	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   943	7	35	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   943	92	36	destination$iv$iv	Ljava/util/Collection;
/*     */     //   950	12	38	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   981	4	41	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   985	44	42	element$iv$iv	Ljava/lang/Object;
/*     */     //   995	11	44	it	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;
/*     */     //   1012	13	46	it$iv$iv	Ljava/lang/Object;
/*     */     //   1066	26	48	candidatesText	Ljava/lang/String;
/*     */     //   314	27	28	$i$f$service	I
/*     */     //   998	8	45	$i$a$-mapNotNull-AgentUtilsKt$smartLocate$2$1$1$candidatesText$1	I
/*     */     //   1015	10	47	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   988	41	43	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   953	80	39	$i$f$forEach	I
/*     */     //   946	89	37	$i$f$mapNotNullTo	I
/*     */     //   927	112	34	$i$f$mapNotNull	I
/*     */     //   300	195	26	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2$1$1	I
/*     */     //   285	210	25	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   267	228	23	$i$f$ifError	I
/*     */     //   260	235	21	$i$f$ifDoesNotExist	I
/*     */     //   233	262	19	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2$1	I
/*     */     //   218	277	18	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   200	295	16	$i$f$ifError	I
/*     */     //   193	302	14	$i$f$ifDoesNotExist	I
/*     */     //   171	324	12	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2	I
/*     */     //   156	339	11	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   138	357	9	$i$f$ifError	I
/*     */     //   131	364	7	$i$f$ifDoesNotExist	I
/*     */     //   1223	162	9	$i$a$-ifSuccess-AgentUtilsKt$smartLocate$3	I
/*     */     //   1205	185	7	$i$f$ifSuccess	I
/*     */     //   0	1402	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   54	1337	50	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   61	1330	49	$result	Ljava/lang/Object;
/*     */     //   531	179	26	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2$1$1	I
/*     */     //   528	182	25	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   525	185	23	$i$f$ifError	I
/*     */     //   522	188	21	$i$f$ifDoesNotExist	I
/*     */     //   519	191	19	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2$1	I
/*     */     //   516	194	18	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   513	197	16	$i$f$ifError	I
/*     */     //   510	200	14	$i$f$ifDoesNotExist	I
/*     */     //   507	203	12	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2	I
/*     */     //   504	206	11	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   501	209	9	$i$f$ifError	I
/*     */     //   498	212	7	$i$f$ifDoesNotExist	I
/*     */     //   746	410	26	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2$1$1	I
/*     */     //   743	424	25	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   740	429	23	$i$f$ifError	I
/*     */     //   737	433	21	$i$f$ifDoesNotExist	I
/*     */     //   734	437	19	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2$1	I
/*     */     //   731	451	18	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   728	456	16	$i$f$ifError	I
/*     */     //   725	460	14	$i$f$ifDoesNotExist	I
/*     */     //   722	464	12	$i$a$-ifDoesNotExist-AgentUtilsKt$smartLocate$2	I
/*     */     //   719	478	11	$i$a$-ifError-AgentUtilsKt$ifDoesNotExist$1$iv	I
/*     */     //   716	483	9	$i$f$ifError	I
/*     */     //   713	487	7	$i$f$ifDoesNotExist	I
/*     */   }
/*     */   
/*     */   private static final Result smartLocate$lambda$3(LocateTarget $target, String p, VirtualFile scope) {
/*     */     Intrinsics.checkNotNullParameter(p, "p");
/*     */     Intrinsics.checkNotNullParameter(scope, "scope");
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[$target.ordinal()]) {
/*     */       case 1:
/*     */       
/*     */       case 2:
/*     */       
/*     */       case 3:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   private static final CharSequence smartLocate$lambda$8$lambda$7$lambda$6$lambda$5(ExecutionAgentContext $context, Path it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     Intrinsics.checkNotNullExpressionValue($context.getCurrentDir().toNioPath(), "toNioPath(...)");
/*     */     Path relativePath = PathsKt.relativeToOrNull(it, $context.getCurrentDir().toNioPath());
/*     */     return "  - absolute path: \"" + it + "\", relative path from the current directory: \"" + relativePath + "\"";
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object printScreen(@NotNull Project project, @NotNull VirtualFile file, int startLine, int window, @NotNull String separator, @Nullable AgentSessionHistory agentSessionHistory, @NotNull Continuation<? super String> $completion) {
/*     */     return printScreen(project, file, CollectionsKt.listOf(new PrintBlock(startLine, window, 0, 0, 0, 28, null)), separator, agentSessionHistory, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object printScreen(@NotNull Project project, @NotNull VirtualFile file, @NotNull PrintBlock block, @NotNull String separator, @Nullable AgentSessionHistory agentSessionHistory, @NotNull Continuation<? super String> $completion) {
/*     */     return printScreen(project, file, CollectionsKt.listOf(block), separator, agentSessionHistory, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object printScreen(@NotNull Project paramProject, @NotNull VirtualFile file, @NotNull List blocks, @NotNull String separator, @Nullable AgentSessionHistory agentSessionHistory, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/AgentUtilsKt$printScreen$3
/*     */     //   5: ifeq -> 43
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/AgentUtilsKt$printScreen$3
/*     */     //   13: astore #8
/*     */     //   15: aload #8
/*     */     //   17: getfield label : I
/*     */     //   20: ldc_w -2147483648
/*     */     //   23: iand
/*     */     //   24: ifeq -> 43
/*     */     //   27: aload #8
/*     */     //   29: dup
/*     */     //   30: getfield label : I
/*     */     //   33: ldc_w -2147483648
/*     */     //   36: isub
/*     */     //   37: putfield label : I
/*     */     //   40: goto -> 54
/*     */     //   43: new com/intellij/ml/llm/matterhorn/ej/core/actions/AgentUtilsKt$printScreen$3
/*     */     //   46: dup
/*     */     //   47: aload #5
/*     */     //   49: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   52: astore #8
/*     */     //   54: aload #8
/*     */     //   56: getfield result : Ljava/lang/Object;
/*     */     //   59: astore #7
/*     */     //   61: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   64: astore #9
/*     */     //   66: aload #8
/*     */     //   68: getfield label : I
/*     */     //   71: tableswitch default -> 231, 0 -> 92, 1 -> 148
/*     */     //   92: aload #7
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   103: aload #8
/*     */     //   105: aload #8
/*     */     //   107: aload_1
/*     */     //   108: putfield L$0 : Ljava/lang/Object;
/*     */     //   111: aload #8
/*     */     //   113: aload_2
/*     */     //   114: putfield L$1 : Ljava/lang/Object;
/*     */     //   117: aload #8
/*     */     //   119: aload_3
/*     */     //   120: putfield L$2 : Ljava/lang/Object;
/*     */     //   123: aload #8
/*     */     //   125: aload #4
/*     */     //   127: putfield L$3 : Ljava/lang/Object;
/*     */     //   130: aload #8
/*     */     //   132: iconst_1
/*     */     //   133: putfield label : I
/*     */     //   136: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   139: dup
/*     */     //   140: aload #9
/*     */     //   142: if_acmpne -> 192
/*     */     //   145: aload #9
/*     */     //   147: areturn
/*     */     //   148: aload #8
/*     */     //   150: getfield L$3 : Ljava/lang/Object;
/*     */     //   153: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory
/*     */     //   156: astore #4
/*     */     //   158: aload #8
/*     */     //   160: getfield L$2 : Ljava/lang/Object;
/*     */     //   163: checkcast java/lang/String
/*     */     //   166: astore_3
/*     */     //   167: aload #8
/*     */     //   169: getfield L$1 : Ljava/lang/Object;
/*     */     //   172: checkcast java/util/List
/*     */     //   175: astore_2
/*     */     //   176: aload #8
/*     */     //   178: getfield L$0 : Ljava/lang/Object;
/*     */     //   181: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   184: astore_1
/*     */     //   185: aload #7
/*     */     //   187: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   190: aload #7
/*     */     //   192: checkcast com/intellij/openapi/editor/Document
/*     */     //   195: astore #6
/*     */     //   197: aload #6
/*     */     //   199: ifnonnull -> 206
/*     */     //   202: ldc_w 'ERROR: Failed to load document for file'
/*     */     //   205: areturn
/*     */     //   206: aload_1
/*     */     //   207: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   210: dup
/*     */     //   211: ldc_w 'toNioPath(...)'
/*     */     //   214: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   217: aload #6
/*     */     //   219: aload_2
/*     */     //   220: aload_3
/*     */     //   221: iconst_0
/*     */     //   222: aload #4
/*     */     //   224: bipush #16
/*     */     //   226: aconst_null
/*     */     //   227: invokestatic printScreen$default : (Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/util/List;Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   230: areturn
/*     */     //   231: new java/lang/IllegalStateException
/*     */     //   234: dup
/*     */     //   235: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   238: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   241: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #304	-> 64
/*     */     //   #311	-> 97
/*     */     //   #304	-> 145
/*     */     //   #315	-> 197
/*     */     //   #316	-> 202
/*     */     //   #320	-> 206
/*     */     //   #321	-> 217
/*     */     //   #322	-> 219
/*     */     //   #323	-> 220
/*     */     //   #319	-> 221
/*     */     //   #324	-> 222
/*     */     //   #319	-> 224
/*     */     //   #304	-> 231
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	51	1	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   185	46	1	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   97	51	2	blocks	Ljava/util/List;
/*     */     //   176	55	2	blocks	Ljava/util/List;
/*     */     //   97	51	3	separator	Ljava/lang/String;
/*     */     //   167	64	3	separator	Ljava/lang/String;
/*     */     //   97	51	4	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   158	73	4	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   197	34	6	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   0	242	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   54	177	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   61	170	7	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Document printScreen$lambda$10(VirtualFile $file) {
/*     */     return FileDocumentManager.getInstance().getDocument($file);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String printScreen(@NotNull Path path, @NotNull Document document, @NotNull List blocks, @NotNull String separator, int codeThreshold, @Nullable AgentSessionHistory agentSessionHistory) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     Intrinsics.checkNotNullParameter(document, "document");
/*     */     Intrinsics.checkNotNullParameter(blocks, "blocks");
/*     */     Intrinsics.checkNotNullParameter(separator, "separator");
/*     */     Iterator<PrintBlock> iterator = blocks.iterator();
/*     */     PrintBlock it = iterator.next();
/*     */     int $i$a$-minOfOrNull-AgentUtilsKt$printScreen$firstLine$1 = 0;
/*     */     Integer integer;
/*     */     for (integer = Integer.valueOf(it.getStartLine()); iterator.hasNext(); ) {
/*     */       PrintBlock printBlock = iterator.next();
/*     */       int i = 0;
/*     */       Integer integer1 = Integer.valueOf(printBlock.getStartLine());
/*     */       if (integer.compareTo(integer1) > 0)
/*     */         integer = integer1; 
/*     */     } 
/*     */     !iterator.hasNext() ? null : integer;
/*     */     int firstLine = ((!iterator.hasNext() ? null : integer) != null) ? (!iterator.hasNext() ? null : integer).intValue() : 1;
/*     */     if (firstLine == 1 && document.getTextLength() == 0)
/*     */       return "<File is empty>\n"; 
/*     */     Iterable $this$map$iv = blocks;
/*     */     int $i$f$map = 0;
/*     */     Iterable iterable1 = $this$map$iv;
/*     */     Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : iterable1) {
/*     */       PrintBlock printBlock = (PrintBlock)item$iv$iv;
/*     */       Collection collection = destination$iv$iv;
/*     */       int $i$a$-map-AgentUtilsKt$printScreen$constrainedBlocks$1 = 0;
/*     */     } 
/*     */     List<PrintBlock> constrainedBlocks = (List)destination$iv$iv;
/*     */     return printScreenImpl(constrainedBlocks, document, path, separator, codeThreshold, agentSessionHistory);
/*     */   }
/*     */   
/*     */   private static final String printScreenImpl(List<PrintBlock> blocks, Document document, Path path, String separator, int codeThreshold, AgentSessionHistory agentSessionHistory) {
/*     */     // Byte code:
/*     */     //   0: new java/lang/StringBuilder
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: astore #6
/*     */     //   9: aload #6
/*     */     //   11: astore #7
/*     */     //   13: iconst_0
/*     */     //   14: istore #8
/*     */     //   16: aload_0
/*     */     //   17: iload #4
/*     */     //   19: invokestatic mergePrintBlocks : (Ljava/util/List;I)Ljava/util/List;
/*     */     //   22: checkcast java/lang/Iterable
/*     */     //   25: astore #9
/*     */     //   27: iconst_0
/*     */     //   28: istore #10
/*     */     //   30: aload #9
/*     */     //   32: astore #11
/*     */     //   34: new java/util/ArrayList
/*     */     //   37: dup
/*     */     //   38: aload #9
/*     */     //   40: bipush #10
/*     */     //   42: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   45: invokespecial <init> : (I)V
/*     */     //   48: checkcast java/util/Collection
/*     */     //   51: astore #12
/*     */     //   53: iconst_0
/*     */     //   54: istore #13
/*     */     //   56: aload #11
/*     */     //   58: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   63: astore #14
/*     */     //   65: aload #14
/*     */     //   67: invokeinterface hasNext : ()Z
/*     */     //   72: ifeq -> 163
/*     */     //   75: aload #14
/*     */     //   77: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   82: astore #15
/*     */     //   84: aload #12
/*     */     //   86: aload #15
/*     */     //   88: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*     */     //   91: astore #16
/*     */     //   93: astore #17
/*     */     //   95: iconst_0
/*     */     //   96: istore #18
/*     */     //   98: new com/intellij/ml/llm/matterhorn/ej/core/actions/LinesBlock
/*     */     //   101: dup
/*     */     //   102: aload_1
/*     */     //   103: aload #16
/*     */     //   105: invokevirtual getStartLine : ()I
/*     */     //   108: aload #16
/*     */     //   110: invokevirtual getTopMargin : ()I
/*     */     //   113: isub
/*     */     //   114: aload #16
/*     */     //   116: invokevirtual getMinWindow : ()I
/*     */     //   119: invokestatic constraintLine : (Lcom/intellij/openapi/editor/Document;II)I
/*     */     //   122: aload #16
/*     */     //   124: invokevirtual getStartLine : ()I
/*     */     //   127: aload #16
/*     */     //   129: invokevirtual getWindow : ()I
/*     */     //   132: aload #16
/*     */     //   134: invokevirtual getBottomMargin : ()I
/*     */     //   137: iadd
/*     */     //   138: aload #16
/*     */     //   140: invokevirtual getMinWindow : ()I
/*     */     //   143: invokestatic max : (II)I
/*     */     //   146: iadd
/*     */     //   147: invokespecial <init> : (II)V
/*     */     //   150: nop
/*     */     //   151: aload #17
/*     */     //   153: swap
/*     */     //   154: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   159: pop
/*     */     //   160: goto -> 65
/*     */     //   163: aload #12
/*     */     //   165: checkcast java/util/List
/*     */     //   168: nop
/*     */     //   169: astore #19
/*     */     //   171: aload_1
/*     */     //   172: invokeinterface getLineCount : ()I
/*     */     //   177: istore #9
/*     */     //   179: aload #7
/*     */     //   181: aload_2
/*     */     //   182: iload #9
/*     */     //   184: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;I)Ljava/lang/String;
/*     */     //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   192: dup
/*     */     //   193: ldc_w 'append(...)'
/*     */     //   196: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   199: bipush #10
/*     */     //   201: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   204: dup
/*     */     //   205: ldc_w 'append(...)'
/*     */     //   208: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   211: pop
/*     */     //   212: aload #19
/*     */     //   214: checkcast java/lang/Iterable
/*     */     //   217: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   222: astore #13
/*     */     //   224: aload #13
/*     */     //   226: invokeinterface hasNext : ()Z
/*     */     //   231: ifne -> 238
/*     */     //   234: aconst_null
/*     */     //   235: goto -> 325
/*     */     //   238: aload #13
/*     */     //   240: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   245: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/LinesBlock
/*     */     //   248: astore #14
/*     */     //   250: iconst_0
/*     */     //   251: istore #15
/*     */     //   253: aload #14
/*     */     //   255: invokevirtual getFromLine : ()I
/*     */     //   258: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   261: checkcast java/lang/Comparable
/*     */     //   264: astore #14
/*     */     //   266: aload #13
/*     */     //   268: invokeinterface hasNext : ()Z
/*     */     //   273: ifeq -> 323
/*     */     //   276: aload #13
/*     */     //   278: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   283: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/LinesBlock
/*     */     //   286: astore #15
/*     */     //   288: iconst_0
/*     */     //   289: istore #16
/*     */     //   291: aload #15
/*     */     //   293: invokevirtual getFromLine : ()I
/*     */     //   296: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   299: checkcast java/lang/Comparable
/*     */     //   302: astore #15
/*     */     //   304: aload #14
/*     */     //   306: aload #15
/*     */     //   308: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   313: ifle -> 266
/*     */     //   316: aload #15
/*     */     //   318: astore #14
/*     */     //   320: goto -> 266
/*     */     //   323: aload #14
/*     */     //   325: checkcast java/lang/Integer
/*     */     //   328: dup
/*     */     //   329: ifnull -> 338
/*     */     //   332: invokevirtual intValue : ()I
/*     */     //   335: goto -> 340
/*     */     //   338: pop
/*     */     //   339: iconst_1
/*     */     //   340: istore #10
/*     */     //   342: iload #10
/*     */     //   344: iconst_1
/*     */     //   345: if_icmpeq -> 382
/*     */     //   348: aload #7
/*     */     //   350: iload #10
/*     */     //   352: iconst_1
/*     */     //   353: isub
/*     */     //   354: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   362: dup
/*     */     //   363: ldc_w 'append(...)'
/*     */     //   366: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   369: bipush #10
/*     */     //   371: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   374: dup
/*     */     //   375: ldc_w 'append(...)'
/*     */     //   378: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   381: pop
/*     */     //   382: new kotlin/jvm/internal/Ref$IntRef
/*     */     //   385: dup
/*     */     //   386: invokespecial <init> : ()V
/*     */     //   389: astore #11
/*     */     //   391: aload #11
/*     */     //   393: iload #10
/*     */     //   395: putfield element : I
/*     */     //   398: aload #19
/*     */     //   400: checkcast java/lang/Iterable
/*     */     //   403: ldc_w '\\n...\\n\\n'
/*     */     //   406: checkcast java/lang/CharSequence
/*     */     //   409: aconst_null
/*     */     //   410: aconst_null
/*     */     //   411: iconst_0
/*     */     //   412: aconst_null
/*     */     //   413: iload #9
/*     */     //   415: aload #11
/*     */     //   417: aload #5
/*     */     //   419: aload_2
/*     */     //   420: aload_3
/*     */     //   421: aload_1
/*     */     //   422: <illegal opcode> invoke : (ILkotlin/jvm/internal/Ref$IntRef;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Ljava/nio/file/Path;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function1;
/*     */     //   427: bipush #30
/*     */     //   429: aconst_null
/*     */     //   430: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   433: astore #12
/*     */     //   435: aload #7
/*     */     //   437: aload #12
/*     */     //   439: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   442: pop
/*     */     //   443: aload #11
/*     */     //   445: getfield element : I
/*     */     //   448: iload #9
/*     */     //   450: if_icmpge -> 495
/*     */     //   453: iload #9
/*     */     //   455: aload #11
/*     */     //   457: getfield element : I
/*     */     //   460: isub
/*     */     //   461: istore #13
/*     */     //   463: aload #7
/*     */     //   465: iload #13
/*     */     //   467: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   472: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   475: dup
/*     */     //   476: ldc_w 'append(...)'
/*     */     //   479: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   482: bipush #10
/*     */     //   484: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   487: dup
/*     */     //   488: ldc_w 'append(...)'
/*     */     //   491: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   494: pop
/*     */     //   495: nop
/*     */     //   496: aload #6
/*     */     //   498: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   501: dup
/*     */     //   502: ldc_w 'toString(...)'
/*     */     //   505: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   508: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #373	-> 0
/*     */     //   #374	-> 16
/*     */     //   #618	-> 30
/*     */     //   #619	-> 56
/*     */     //   #620	-> 84
/*     */     //   #375	-> 98
/*     */     //   #376	-> 102
/*     */     //   #377	-> 122
/*     */     //   #377	-> 146
/*     */     //   #375	-> 147
/*     */     //   #378	-> 150
/*     */     //   #620	-> 154
/*     */     //   #621	-> 163
/*     */     //   #618	-> 168
/*     */     //   #374	-> 169
/*     */     //   #380	-> 171
/*     */     //   #381	-> 179
/*     */     //   #382	-> 212
/*     */     //   #613	-> 250
/*     */     //   #382	-> 253
/*     */     //   #382	-> 261
/*     */     //   #613	-> 288
/*     */     //   #382	-> 291
/*     */     //   #382	-> 299
/*     */     //   #382	-> 325
/*     */     //   #384	-> 342
/*     */     //   #385	-> 348
/*     */     //   #387	-> 382
/*     */     //   #388	-> 398
/*     */     //   #394	-> 435
/*     */     //   #396	-> 443
/*     */     //   #397	-> 453
/*     */     //   #398	-> 463
/*     */     //   #400	-> 495
/*     */     //   #373	-> 496
/*     */     //   #400	-> 508
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   98	53	18	$i$a$-map-AgentUtilsKt$printScreenImpl$1$lineBlocks$1	I
/*     */     //   95	56	16	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;
/*     */     //   84	76	15	item$iv$iv	Ljava/lang/Object;
/*     */     //   56	109	13	$i$f$mapTo	I
/*     */     //   53	112	11	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   53	112	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   30	139	10	$i$f$map	I
/*     */     //   27	142	9	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   253	5	15	$i$a$-minOfOrNull-AgentUtilsKt$printScreenImpl$1$firstLine$1	I
/*     */     //   250	8	14	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LinesBlock;
/*     */     //   291	5	16	$i$a$-minOfOrNull-AgentUtilsKt$printScreenImpl$1$firstLine$1	I
/*     */     //   288	8	15	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LinesBlock;
/*     */     //   463	31	13	linesBelow	I
/*     */     //   16	480	8	$i$a$-buildString-AgentUtilsKt$printScreenImpl$1	I
/*     */     //   171	325	19	lineBlocks	Ljava/util/List;
/*     */     //   179	317	9	documentLineCount	I
/*     */     //   342	154	10	firstLine	I
/*     */     //   391	105	11	maxEndLineIncl	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   435	61	12	blocksText	Ljava/lang/String;
/*     */     //   13	483	7	$this$printScreenImpl_u24lambda_u2416	Ljava/lang/StringBuilder;
/*     */     //   0	509	0	blocks	Ljava/util/List;
/*     */     //   0	509	1	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   0	509	2	path	Ljava/nio/file/Path;
/*     */     //   0	509	3	separator	Ljava/lang/String;
/*     */     //   0	509	4	codeThreshold	I
/*     */     //   0	509	5	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */   }
/*     */   
/*     */   private static final CharSequence printScreenImpl$lambda$16$lambda$15(int $documentLineCount, Ref.IntRef $maxEndLineIncl, AgentSessionHistory $agentSessionHistory, Path $path, String $separator, Document $document, LinesBlock it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     int endLineIncl = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(it.getUntilLine(), $documentLineCount), it.getFromLine());
/*     */     $maxEndLineIncl.element = Math.max($maxEndLineIncl.element, endLineIncl);
/*     */     if ($agentSessionHistory != null) {
/*     */       $agentSessionHistory.addShownCodeRange($path, it.getFromLine(), endLineIncl);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     return printScreenPart(it.getFromLine(), $separator, endLineIncl + 1, $document);
/*     */   }
/*     */   
/*     */   public static final int constraintStartLineNum(int lineNum, int windowSize, int bottomMargin, int totalLines) {
/*     */     return Math.min(lineNum, Math.max(1, totalLines - windowSize - bottomMargin));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String truncateLongLine(@NotNull String line, int maxLength, int keepSymbols) {
/*     */     Intrinsics.checkNotNullParameter(line, "line");
/*     */     if (line.length() <= maxLength)
/*     */       return line; 
/*     */     Intrinsics.checkNotNullExpressionValue(line.substring(0, keepSymbols), "substring(...)");
/*     */     return line.substring(0, keepSymbols) + "...(" + line.substring(0, keepSymbols) + " characters truncated, it's impossible to view or edit this line)";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String printScreenPart(int startLine, @NotNull String separator, int endLineExcl, @NotNull Document document) {
/*     */     Intrinsics.checkNotNullParameter(separator, "separator");
/*     */     Intrinsics.checkNotNullParameter(document, "document");
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$printScreenPart_u24lambda_u2417 = stringBuilder1;
/*     */     int $i$a$-buildString-AgentUtilsKt$printScreenPart$1 = 0;
/*     */     for (int lineIndex = startLine; lineIndex < endLineExcl; lineIndex++) {
/*     */       int zeroBasedLineIndex = lineIndex - 1;
/*     */       Intrinsics.checkNotNullExpressionValue(document.getText(new TextRange(document.getLineStartOffset(zeroBasedLineIndex), document.getLineEndOffset(zeroBasedLineIndex))), "getText(...)");
/*     */       String lineText = document.getText(new TextRange(document.getLineStartOffset(zeroBasedLineIndex), document.getLineEndOffset(zeroBasedLineIndex)));
/*     */       Intrinsics.checkNotNullExpressionValue($this$printScreenPart_u24lambda_u2417.append(lineIndex).append(separator), "append(...)");
/*     */       StringBuilder stringBuilder = $this$printScreenPart_u24lambda_u2417.append(lineIndex).append(separator);
/*     */       Intrinsics.checkNotNullExpressionValue(stringBuilder.append(truncateLongLine$default(lineText, 0, 0, 6, null)), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(stringBuilder.append(truncateLongLine$default(lineText, 0, 0, 6, null)).append('\n'), "append(...)");
/*     */       stringBuilder.append(truncateLongLine$default(lineText, 0, 0, 6, null)).append('\n');
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final List<PrintBlock> mergePrintBlocks(@NotNull List blocks, int codeThreshold) {
/*     */     Intrinsics.checkNotNullParameter(blocks, "blocks");
/*     */     List<PrintBlock> resultBlockLines = new ArrayList();
/*     */     Iterable $this$flatMap$iv = blocks;
/*     */     int $i$f$flatMap = 0;
/*     */     Iterable iterable1 = $this$flatMap$iv;
/*     */     Collection destination$iv$iv = new ArrayList();
/*     */     int $i$f$flatMapTo = 0;
/*     */     for (Object element$iv$iv : iterable1) {
/*     */       PrintBlock it = (PrintBlock)element$iv$iv;
/*     */       int $i$a$-flatMap-AgentUtilsKt$mergePrintBlocks$blockLines$1 = 0;
/*     */       BlockLine[] arrayOfBlockLine = new BlockLine[2];
/*     */       arrayOfBlockLine[0] = new BlockLine(it.getStartLine() - it.getTopMargin(), true, it.getMinWindow());
/*     */       arrayOfBlockLine[1] = new BlockLine(it.getStartLine() + it.getWindow() + it.getBottomMargin(), false, it.getMinWindow());
/*     */     } 
/*     */     $this$flatMap$iv = destination$iv$iv;
/*     */     int $i$f$sortedBy = 0;
/*     */     List blockLines = CollectionsKt.sortedWith($this$flatMap$iv, new AgentUtilsKt$mergePrintBlocks$$inlined$sortedBy$1());
/*     */     int blocksMerged = 0;
/*     */     int blockStart = 0;
/*     */     blockStart = -1;
/*     */     int blockEnd = 0, i = -1;
/*     */     int minWindow = 0;
/*     */     Iterable $this$forEach$iv = blockLines;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       int j;
/*     */       Object element$iv = iterator.next();
/*     */       BlockLine line = (BlockLine)element$iv;
/*     */       int $i$a$-forEach-AgentUtilsKt$mergePrintBlocks$1 = 0;
/*     */       if (line.getOpen()) {
/*     */         if (blocksMerged == 0)
/*     */           blockStart = line.getLine(); 
/*     */         minWindow = Math.max(minWindow, line.getMinWindow());
/*     */         int k = blocksMerged;
/*     */         j = k + 1;
/*     */       } else {
/*     */         j--;
/*     */         if (j == 0) {
/*     */           i = line.getLine();
/*     */           PrintBlock last = (PrintBlock)CollectionsKt.lastOrNull(resultBlockLines);
/*     */           resultBlockLines.removeLast();
/*     */           (last != null && blockStart - last.getStartLine() + last.getWindow() <= codeThreshold) ? resultBlockLines.add(new PrintBlock(last.getStartLine(), i - last.getStartLine(), 0, 0, minWindow, 12, null)) : resultBlockLines.add(new PrintBlock(blockStart, i - blockStart, 0, 0, minWindow, 12, null));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     return resultBlockLines;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final List<String> parseArgs(@NotNull String args) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'args'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: new java/util/ArrayList
/*     */     //   10: dup
/*     */     //   11: invokespecial <init> : ()V
/*     */     //   14: checkcast java/util/List
/*     */     //   17: astore_1
/*     */     //   18: new java/lang/StringBuilder
/*     */     //   21: dup
/*     */     //   22: invokespecial <init> : ()V
/*     */     //   25: astore_2
/*     */     //   26: iconst_0
/*     */     //   27: istore_3
/*     */     //   28: iconst_0
/*     */     //   29: istore #4
/*     */     //   31: aconst_null
/*     */     //   32: astore #5
/*     */     //   34: iconst_0
/*     */     //   35: istore #6
/*     */     //   37: aload_0
/*     */     //   38: invokevirtual length : ()I
/*     */     //   41: istore #7
/*     */     //   43: iload #6
/*     */     //   45: iload #7
/*     */     //   47: if_icmpge -> 315
/*     */     //   50: aload_0
/*     */     //   51: iload #6
/*     */     //   53: invokevirtual charAt : (I)C
/*     */     //   56: istore #8
/*     */     //   58: nop
/*     */     //   59: iload #8
/*     */     //   61: bipush #34
/*     */     //   63: if_icmpne -> 141
/*     */     //   66: aload #5
/*     */     //   68: bipush #92
/*     */     //   70: istore #9
/*     */     //   72: dup
/*     */     //   73: ifnonnull -> 80
/*     */     //   76: pop
/*     */     //   77: goto -> 88
/*     */     //   80: invokevirtual charValue : ()C
/*     */     //   83: iload #9
/*     */     //   85: if_icmpeq -> 141
/*     */     //   88: iload #4
/*     */     //   90: ifne -> 132
/*     */     //   93: iload_3
/*     */     //   94: ifne -> 101
/*     */     //   97: iconst_1
/*     */     //   98: goto -> 102
/*     */     //   101: iconst_0
/*     */     //   102: istore_3
/*     */     //   103: iload_3
/*     */     //   104: ifne -> 126
/*     */     //   107: aload_1
/*     */     //   108: aload_2
/*     */     //   109: invokestatic parseArgument : (Ljava/lang/StringBuilder;)Ljava/lang/String;
/*     */     //   112: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   117: pop
/*     */     //   118: new java/lang/StringBuilder
/*     */     //   121: dup
/*     */     //   122: invokespecial <init> : ()V
/*     */     //   125: astore_2
/*     */     //   126: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   129: goto -> 301
/*     */     //   132: aload_2
/*     */     //   133: iload #8
/*     */     //   135: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   138: goto -> 301
/*     */     //   141: iload #8
/*     */     //   143: bipush #39
/*     */     //   145: if_icmpne -> 225
/*     */     //   148: aload #5
/*     */     //   150: bipush #92
/*     */     //   152: istore #9
/*     */     //   154: dup
/*     */     //   155: ifnonnull -> 162
/*     */     //   158: pop
/*     */     //   159: goto -> 170
/*     */     //   162: invokevirtual charValue : ()C
/*     */     //   165: iload #9
/*     */     //   167: if_icmpeq -> 225
/*     */     //   170: iload_3
/*     */     //   171: ifne -> 216
/*     */     //   174: iload #4
/*     */     //   176: ifne -> 183
/*     */     //   179: iconst_1
/*     */     //   180: goto -> 184
/*     */     //   183: iconst_0
/*     */     //   184: istore #4
/*     */     //   186: iload #4
/*     */     //   188: ifne -> 210
/*     */     //   191: aload_1
/*     */     //   192: aload_2
/*     */     //   193: invokestatic parseArgument : (Ljava/lang/StringBuilder;)Ljava/lang/String;
/*     */     //   196: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   201: pop
/*     */     //   202: new java/lang/StringBuilder
/*     */     //   205: dup
/*     */     //   206: invokespecial <init> : ()V
/*     */     //   209: astore_2
/*     */     //   210: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   213: goto -> 301
/*     */     //   216: aload_2
/*     */     //   217: iload #8
/*     */     //   219: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   222: goto -> 301
/*     */     //   225: iload #8
/*     */     //   227: bipush #32
/*     */     //   229: if_icmpne -> 295
/*     */     //   232: iload_3
/*     */     //   233: ifne -> 241
/*     */     //   236: iload #4
/*     */     //   238: ifeq -> 250
/*     */     //   241: aload_2
/*     */     //   242: iload #8
/*     */     //   244: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   247: goto -> 301
/*     */     //   250: aload_2
/*     */     //   251: checkcast java/lang/CharSequence
/*     */     //   254: invokeinterface length : ()I
/*     */     //   259: ifle -> 266
/*     */     //   262: iconst_1
/*     */     //   263: goto -> 267
/*     */     //   266: iconst_0
/*     */     //   267: ifeq -> 289
/*     */     //   270: aload_1
/*     */     //   271: aload_2
/*     */     //   272: invokestatic parseArgument : (Ljava/lang/StringBuilder;)Ljava/lang/String;
/*     */     //   275: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   280: pop
/*     */     //   281: new java/lang/StringBuilder
/*     */     //   284: dup
/*     */     //   285: invokespecial <init> : ()V
/*     */     //   288: astore_2
/*     */     //   289: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   292: goto -> 301
/*     */     //   295: aload_2
/*     */     //   296: iload #8
/*     */     //   298: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   301: pop
/*     */     //   302: iload #8
/*     */     //   304: invokestatic valueOf : (C)Ljava/lang/Character;
/*     */     //   307: astore #5
/*     */     //   309: iinc #6, 1
/*     */     //   312: goto -> 43
/*     */     //   315: aload_2
/*     */     //   316: checkcast java/lang/CharSequence
/*     */     //   319: invokeinterface length : ()I
/*     */     //   324: ifle -> 331
/*     */     //   327: iconst_1
/*     */     //   328: goto -> 332
/*     */     //   331: iconst_0
/*     */     //   332: ifeq -> 346
/*     */     //   335: aload_1
/*     */     //   336: aload_2
/*     */     //   337: invokestatic parseArgument : (Ljava/lang/StringBuilder;)Ljava/lang/String;
/*     */     //   340: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   345: pop
/*     */     //   346: aload_1
/*     */     //   347: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #497	-> 7
/*     */     //   #497	-> 17
/*     */     //   #498	-> 18
/*     */     //   #499	-> 26
/*     */     //   #500	-> 28
/*     */     //   #501	-> 31
/*     */     //   #503	-> 34
/*     */     //   #504	-> 58
/*     */     //   #505	-> 59
/*     */     //   #506	-> 88
/*     */     //   #507	-> 93
/*     */     //   #508	-> 103
/*     */     //   #510	-> 107
/*     */     //   #511	-> 118
/*     */     //   #514	-> 132
/*     */     //   #518	-> 141
/*     */     //   #519	-> 170
/*     */     //   #520	-> 174
/*     */     //   #521	-> 186
/*     */     //   #523	-> 191
/*     */     //   #524	-> 202
/*     */     //   #527	-> 216
/*     */     //   #531	-> 225
/*     */     //   #532	-> 232
/*     */     //   #533	-> 241
/*     */     //   #535	-> 250
/*     */     //   #535	-> 267
/*     */     //   #536	-> 270
/*     */     //   #537	-> 281
/*     */     //   #542	-> 295
/*     */     //   #544	-> 302
/*     */     //   #503	-> 309
/*     */     //   #547	-> 315
/*     */     //   #547	-> 332
/*     */     //   #548	-> 335
/*     */     //   #551	-> 346
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   58	251	8	char	C
/*     */     //   18	330	1	parts	Ljava/util/List;
/*     */     //   26	322	2	current	Ljava/lang/StringBuilder;
/*     */     //   28	320	3	inDoubleQuotes	Z
/*     */     //   31	317	4	inSingleQuotes	Z
/*     */     //   34	314	5	prevChar	Ljava/lang/Character;
/*     */     //   0	348	0	args	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String parseArgument(@NotNull StringBuilder $this$parseArgument) {
/*     */     Intrinsics.checkNotNullParameter($this$parseArgument, "<this>");
/*     */     Intrinsics.checkNotNullExpressionValue($this$parseArgument.toString(), "toString(...)");
/*     */     return StringsKt.replace$default(StringsKt.replace$default($this$parseArgument.toString(), "\\\"", "\"", false, 4, null), "\\'", "'", false, 4, null).toString();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentUtils.kt", l = {311}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"file", "blocks", "separator", "agentSessionHistory"}, m = "printScreen", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.AgentUtilsKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AgentUtilsKt$printScreen$3 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     AgentUtilsKt$printScreen$3(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AgentUtilsKt.printScreen((Project)null, (VirtualFile)null, (List<PrintBlock>)null, (String)null, (AgentSessionHistory)null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentUtils.kt", l = {234, 237}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, n = {"path", "context", "target", "fileName", "searchType", "searchEverywhere", "allowOnlyProjectFile", "path", "context", "target", "fileName", "allowOnlyProjectFile"}, m = "smartLocate", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.AgentUtilsKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AgentUtilsKt$smartLocate$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     AgentUtilsKt$smartLocate$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AgentUtilsKt.smartLocate(null, null, null, false, (Continuation<? super Result<? extends VirtualFile, ? extends OpenFileErrorType>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\AgentUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */