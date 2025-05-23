/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\013\b\002\030\0002\b\022\004\022\0020\0000\001B\033\b\002\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\004\b\005\020\006J\b\020\r\032\0020\003H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000R\021\020\n\032\0020\0038F¢\006\006\032\004\b\013\020\fj\002\b\007j\002\b\bj\002\b\t¨\006\016"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VtyEntityFileDescriptor;", "", "filenameWithoutExtension", "", "displayName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "TASK", "CHAT_TASK", "FUNCTION", "filename", "getFilename", "()Ljava/lang/String;", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*     */ enum VtyEntityFileDescriptor
/*     */ {
/*     */   @NotNull
/*     */   private final String filenameWithoutExtension;
/*     */   @NotNull
/*     */   private final String displayName;
/*     */   
/*     */   VtyEntityFileDescriptor(String filenameWithoutExtension, String displayName) {
/*     */     this.filenameWithoutExtension = filenameWithoutExtension;
/*     */     this.displayName = displayName;
/*     */   }
/*     */   
/* 176 */   TASK("task", null, 2, null),
/* 177 */   CHAT_TASK("chatTask", "chat task"),
/* 178 */   FUNCTION("function", null, 2, null);
/*     */   @NotNull
/*     */   public final String getFilename() {
/* 181 */     return this.filenameWithoutExtension + ".yaml"; }
/*     */   @NotNull
/* 183 */   public String toString() { return this.displayName; } @NotNull
/* 184 */   public static EnumEntries<VtyEntityFileDescriptor> getEntries() { return $ENTRIES; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VtyEntityFileDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */