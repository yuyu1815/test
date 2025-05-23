/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ import ai.grazie.tasks.provider.prompt.velocity.resources.model.VelocityModelFunction;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\007\n\002\020\016\n\002\b\005\n\002\020\013\n\000\n\002\030\002\n\002\b\004\030\0002\b\022\004\022\0020\0020\001:\001\031B\035\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0020\0020\006¢\006\004\b\007\020\bJ\016\020\023\032\0020\0242\006\020\025\032\0020\026J\016\020\027\032\0020\0242\006\020\030\032\0020\016R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\t\020\nR\032\020\005\032\b\022\004\022\0020\0020\006X\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\0168VX\004¢\006\006\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0160\0068VX\004¢\006\006\032\004\b\022\020\f¨\006\032"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag;", "descriptor", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunction;", "tagPriorities", "", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunction;Ljava/util/List;)V", "getDescriptor", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunction;", "getTagPriorities", "()Ljava/util/List;", "entityName", "", "getEntityName", "()Ljava/lang/String;", "registeredTags", "getRegisteredTags", "existsForTag", "", "tag", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;", "existsForModel", "model", "Tag", "tasks-provider-llm-prompt-velocity-model"})
/*    */ @SourceDebugExtension({"SMAP\nfunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functions.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1755#2,3:47\n1755#2,3:50\n*S KotlinDebug\n*F\n+ 1 functions.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction\n*L\n43#1:47,3\n44#1:50,3\n*E\n"})
/*    */ public final class VelocityFunction
/*    */   implements TaggedEntity<VelocityFunction.Tag>
/*    */ {
/*    */   @NotNull
/*    */   private final VelocityModelFunction descriptor;
/*    */   @NotNull
/*    */   private final List<Tag> tagPriorities;
/*    */   
/*    */   public VelocityFunction(@NotNull VelocityModelFunction descriptor, @NotNull List<Tag> tagPriorities) {
/* 26 */     this.descriptor = descriptor;
/* 27 */     this.tagPriorities = tagPriorities; } @NotNull public final VelocityModelFunction getDescriptor() { return this.descriptor; } @NotNull public List<Tag> getTagPriorities() { return this.tagPriorities; } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\005HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\032HÖ\001J\t\020\033\032\0020\rHÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\024\020\020\032\0020\r8VX\004¢\006\006\032\004\b\021\020\017¨\006\034"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;", "tag", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;", "implementation", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionImpl;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionImpl;)V", "getTag", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;", "getImplementation", "()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionImpl;", "tagName", "", "getTagName", "()Ljava/lang/String;", "model", "getModel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */   public static final class Tag implements EntityTag { @NotNull
/*    */     private final VelocityFunctionTag tag; @NotNull
/* 30 */     private final VelocityFunctionImpl implementation; public Tag(@NotNull VelocityFunctionTag tag, @NotNull VelocityFunctionImpl implementation) { this.tag = tag; this.implementation = implementation; } @NotNull public final VelocityFunctionTag getTag() { return this.tag; } @NotNull public final VelocityFunctionImpl getImplementation() { return this.implementation; }
/*    */     @NotNull
/* 32 */     public String getTagName() { return this.tag.getTagName(); }
/*    */     @NotNull public final VelocityFunctionTag component1() { return this.tag; }
/*    */     @NotNull public final VelocityFunctionImpl component2() { return this.implementation; }
/* 35 */     @NotNull public final Tag copy(@NotNull VelocityFunctionTag tag, @NotNull VelocityFunctionImpl implementation) { Intrinsics.checkNotNullParameter(tag, "tag"); Intrinsics.checkNotNullParameter(implementation, "implementation"); return new Tag(tag, implementation); } @NotNull public String getModel() { return this.tag.getLlmProfileId(); }
/*    */     @NotNull public String toString() { return "Tag(tag=" + this.tag + ", implementation=" + this.implementation + ")"; }
/*    */     public int hashCode() { result = this.tag.hashCode(); return result * 31 + this.implementation.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Tag))
/*    */         return false;  Tag tag = (Tag)other; return !Intrinsics.areEqual(this.tag, tag.tag) ? false : (!!Intrinsics.areEqual(this.implementation, tag.implementation)); } }
/* 39 */    @NotNull public String getEntityName() { return this.descriptor.getName(); } @NotNull
/*    */   public List<String> getRegisteredTags() {
/* 41 */     return this.descriptor.getTagPriorities();
/*    */   }
/*    */   
/*    */   public final boolean existsForTag(@NotNull VelocityFunctionTag tag) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'tag'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokevirtual getTagPriorities : ()Ljava/util/List;
/*    */     //   10: checkcast java/lang/Iterable
/*    */     //   13: astore_2
/*    */     //   14: iconst_0
/*    */     //   15: istore_3
/*    */     //   16: aload_2
/*    */     //   17: instanceof java/util/Collection
/*    */     //   20: ifeq -> 39
/*    */     //   23: aload_2
/*    */     //   24: checkcast java/util/Collection
/*    */     //   27: invokeinterface isEmpty : ()Z
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_0
/*    */     //   36: goto -> 93
/*    */     //   39: aload_2
/*    */     //   40: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   45: astore #4
/*    */     //   47: aload #4
/*    */     //   49: invokeinterface hasNext : ()Z
/*    */     //   54: ifeq -> 92
/*    */     //   57: aload #4
/*    */     //   59: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   64: astore #5
/*    */     //   66: aload #5
/*    */     //   68: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag
/*    */     //   71: astore #6
/*    */     //   73: iconst_0
/*    */     //   74: istore #7
/*    */     //   76: aload #6
/*    */     //   78: invokevirtual getTag : ()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;
/*    */     //   81: aload_1
/*    */     //   82: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   85: ifeq -> 47
/*    */     //   88: iconst_1
/*    */     //   89: goto -> 93
/*    */     //   92: iconst_0
/*    */     //   93: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #43	-> 6
/*    */     //   #47	-> 16
/*    */     //   #48	-> 39
/*    */     //   #43	-> 76
/*    */     //   #48	-> 85
/*    */     //   #49	-> 92
/*    */     //   #43	-> 93
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   76	9	7	$i$a$-any-VelocityFunction$existsForTag$1	I
/*    */     //   73	12	6	it	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag;
/*    */     //   66	26	5	element$iv	Ljava/lang/Object;
/*    */     //   16	77	3	$i$f$any	I
/*    */     //   14	79	2	$this$any$iv	Ljava/lang/Iterable;
/*    */     //   0	94	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction;
/*    */     //   0	94	1	tag	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;
/*    */   }
/*    */   
/*    */   public final boolean existsForModel(@NotNull String model) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'model'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokevirtual getTagPriorities : ()Ljava/util/List;
/*    */     //   10: checkcast java/lang/Iterable
/*    */     //   13: astore_2
/*    */     //   14: iconst_0
/*    */     //   15: istore_3
/*    */     //   16: aload_2
/*    */     //   17: instanceof java/util/Collection
/*    */     //   20: ifeq -> 39
/*    */     //   23: aload_2
/*    */     //   24: checkcast java/util/Collection
/*    */     //   27: invokeinterface isEmpty : ()Z
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_0
/*    */     //   36: goto -> 96
/*    */     //   39: aload_2
/*    */     //   40: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   45: astore #4
/*    */     //   47: aload #4
/*    */     //   49: invokeinterface hasNext : ()Z
/*    */     //   54: ifeq -> 95
/*    */     //   57: aload #4
/*    */     //   59: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   64: astore #5
/*    */     //   66: aload #5
/*    */     //   68: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag
/*    */     //   71: astore #6
/*    */     //   73: iconst_0
/*    */     //   74: istore #7
/*    */     //   76: aload #6
/*    */     //   78: invokevirtual getTag : ()Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTag;
/*    */     //   81: invokevirtual getLlmProfileId : ()Ljava/lang/String;
/*    */     //   84: aload_1
/*    */     //   85: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   88: ifeq -> 47
/*    */     //   91: iconst_1
/*    */     //   92: goto -> 96
/*    */     //   95: iconst_0
/*    */     //   96: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 6
/*    */     //   #50	-> 16
/*    */     //   #51	-> 39
/*    */     //   #44	-> 76
/*    */     //   #51	-> 88
/*    */     //   #52	-> 95
/*    */     //   #44	-> 96
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   76	12	7	$i$a$-any-VelocityFunction$existsForModel$1	I
/*    */     //   73	15	6	it	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction$Tag;
/*    */     //   66	29	5	element$iv	Ljava/lang/Object;
/*    */     //   16	80	3	$i$f$any	I
/*    */     //   14	82	2	$this$any$iv	Ljava/lang/Iterable;
/*    */     //   0	97	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction;
/*    */     //   0	97	1	model	Ljava/lang/String;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityFunction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */