/*    */ package ai.grazie.tasks.codegen.model;
/*    */ 
/*    */ import io.swagger.v3.oas.models.OpenAPI;
/*    */ import java.net.URI;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.LinkOption;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.Paths;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B\021\b\026\022\006\020\006\032\0020\007¢\006\004\b\004\020\bJ\032\020\013\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0160\r0\fH\026J\f\020\017\032\0020\007*\0020\003H\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\020"}, d2 = {"Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Local;", "Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary;", "root", "Ljava/nio/file/Path;", "<init>", "(Ljava/nio/file/Path;)V", "rootPath", "", "(Ljava/lang/String;)V", "getRoot", "()Ljava/nio/file/Path;", "read", "", "Lkotlin/Pair;", "Lio/swagger/v3/oas/models/OpenAPI;", "toOpenApiLocation", "tasks-codegen-model"})
/*    */ @SourceDebugExtension({"SMAP\nTasksOpenApiLibrary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksOpenApiLibrary.kt\nai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Local\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/*    */ public final class Local
/*    */   extends TasksOpenApiLibrary
/*    */ {
/*    */   @NotNull
/*    */   private final Path root;
/*    */   
/*    */   public Local(@NotNull Path root) {
/* 34 */     super(null); this.root = root;
/*    */ 
/*    */ 
/*    */     
/* 38 */     if (!Files.exists(this.root, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/*    */     
/*    */     { 
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
/* 93 */       int $i$a$-check-TasksOpenApiLibrary$Local$1 = 0; String str = "Tasks OpenAPI resources directory does not exist: " + this.root; throw new IllegalStateException(str.toString()); }  if (!Files.isDirectory(this.root, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))) { int $i$a$-check-TasksOpenApiLibrary$Local$2 = 0;
/*    */       String str = "Tasks OpenAPI resources should be a directory";
/*    */       throw new IllegalStateException(str.toString()); }
/*    */   
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Path getRoot() {
/*    */     return this.root;
/*    */   }
/*    */   
/*    */   public Local(@NotNull String rootPath) {
/*    */     this(Paths.get(rootPath, new String[0]));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public List<Pair<String, OpenAPI>> read() {
/*    */     return doRead(this.root);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected String toOpenApiLocation(@NotNull Path $this$toOpenApiLocation) {
/*    */     Intrinsics.checkNotNullParameter($this$toOpenApiLocation, "<this>");
/*    */     URI uri = $this$toOpenApiLocation.toUri();
/*    */     Intrinsics.checkNotNullExpressionValue((new URI(uri.getScheme(), null, uri.getPath(), uri.getQuery(), uri.getFragment())).toString(), "toString(...)");
/*    */     return (new URI(uri.getScheme(), null, uri.getPath(), uri.getQuery(), uri.getFragment())).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-codegen-model-0.4.32.jar!\ai\grazie\tasks\codegen\model\TasksOpenApiLibrary$Local.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */