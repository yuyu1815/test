/*     */ package androidx.compose.runtime.internal;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.RecomposeScope;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.SpreadBuilder;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\003\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\020!\n\002\b\002\n\002\020\021\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\002\b\004\b\001\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003¢\006\002\020\007J(\020\021\032\004\030\0010\t2\026\020\022\032\f\022\b\b\001\022\004\030\0010\t0\023\"\004\030\0010\tH\002¢\006\002\020\024J\020\020\025\032\0020\0032\006\020\026\032\0020\003H\002J\020\020\027\032\0020\0302\006\020\031\032\0020\032H\002J\b\020\033\032\0020\030H\002J\016\020\034\032\0020\0302\006\020\035\032\0020\tR\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000R\024\020\006\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013R\020\020\r\032\004\030\0010\016X\016¢\006\002\n\000R\026\020\017\032\n\022\004\022\0020\016\030\0010\020X\016¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\036"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "key", "", "tracked", "", "arity", "(IZI)V", "_block", "", "getArity", "()I", "getKey", "scope", "Landroidx/compose/runtime/RecomposeScope;", "scopes", "", "invoke", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "realParamCount", "params", "trackRead", "", "composer", "Landroidx/compose/runtime/Composer;", "trackWrite", "update", "block", "runtime"})
/*     */ @Stable
/*     */ @SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,193:1\n37#2,2:194\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n113#1:194,2\n*E\n"})
/*     */ public final class ComposableLambdaNImpl implements ComposableLambdaN {
/*     */   private final int key;
/*     */   private final boolean tracked;
/*     */   private final int arity;
/*     */   @Nullable
/*     */   private Object _block;
/*     */   @Nullable
/*     */   private RecomposeScope scope;
/*     */   @Nullable
/*     */   private List<RecomposeScope> scopes;
/*     */   public static final int $stable;
/*     */   
/*  32 */   public ComposableLambdaNImpl(int key, boolean tracked, int arity) { this.key = key;
/*  33 */     this.tracked = tracked;
/*  34 */     this.arity = arity; } public final int getKey() { return this.key; } public int getArity() { return this.arity; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void trackWrite() {
/*  41 */     if (this.tracked) {
/*  42 */       RecomposeScope scope = this.scope;
/*  43 */       if (scope != null) {
/*  44 */         scope.invalidate();
/*  45 */         this.scope = null;
/*     */       } 
/*  47 */       List<RecomposeScope> scopes = this.scopes;
/*  48 */       if (scopes != null) {
/*  49 */         for (int index = 0, i = scopes.size(); index < i; index++) {
/*  50 */           RecomposeScope item = scopes.get(index);
/*  51 */           item.invalidate();
/*     */         } 
/*  53 */         scopes.clear();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void trackRead(Composer composer) {
/*  59 */     if (this.tracked) {
/*  60 */       RecomposeScope scope = composer.getRecomposeScope();
/*  61 */       if (scope != null) {
/*     */         
/*  63 */         composer.recordUsed(scope);
/*  64 */         RecomposeScope lastScope = this.scope;
/*  65 */         if (ComposableLambdaKt.replacableWith(lastScope, scope)) {
/*  66 */           this.scope = scope;
/*     */         } else {
/*  68 */           List<RecomposeScope> lastScopes = this.scopes;
/*  69 */           if (lastScopes == null) {
/*  70 */             List<RecomposeScope> newScopes = new ArrayList();
/*  71 */             this.scopes = newScopes;
/*  72 */             newScopes.add(scope);
/*     */           } else {
/*  74 */             for (int index = 0, i = lastScopes.size(); index < i; index++) {
/*  75 */               RecomposeScope scopeAtIndex = lastScopes.get(index);
/*  76 */               if (ComposableLambdaKt.replacableWith(scopeAtIndex, scope)) {
/*  77 */                 lastScopes.set(index, scope);
/*     */                 return;
/*     */               } 
/*     */             } 
/*  81 */             lastScopes.add(scope);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void update(@NotNull Object block) {
/*  89 */     Intrinsics.checkNotNullParameter(block, "block"); if (!Intrinsics.areEqual(block, this._block)) {
/*  90 */       boolean oldBlockNull = (this._block == null);
/*  91 */       this._block = block;
/*  92 */       if (!oldBlockNull) {
/*  93 */         trackWrite();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private final int realParamCount(int params) {
/*  99 */     int realParams = params;
/* 100 */     realParams--;
/* 101 */     realParams--;
/* 102 */     int changedParams = 1;
/* 103 */     while (changedParams * 10 < realParams) {
/* 104 */       realParams--;
/* 105 */       changedParams++;
/*     */     } 
/* 107 */     return realParams;
/*     */   }
/*     */   
/*     */   @Nullable
/* 111 */   public Object invoke(@NotNull Object... args) { Intrinsics.checkNotNullParameter(args, "args"); int realParams = realParamCount(args.length);
/* 112 */     Intrinsics.checkNotNull(args[realParams], "null cannot be cast to non-null type androidx.compose.runtime.Composer"); Composer c = (Composer)args[realParams];
/* 113 */     Collection $this$toTypedArray$iv = ArraysKt.slice(args, RangesKt.until(0, args.length - 1)); int $i$f$toTypedArray = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/* 195 */     Object[] allArgsButLast = thisCollection$iv.toArray(new Object[0]); Intrinsics.checkNotNull(args[args.length - 1], "null cannot be cast to non-null type kotlin.Int"); int lastChanged = ((Integer)args[args.length - 1]).intValue(); c = c.startRestartGroup(this.key); trackRead(c); int dirty = lastChanged | (c.changed(this) ? ComposableLambdaKt.differentBits(realParams) : ComposableLambdaKt.sameBits(realParams)); Intrinsics.checkNotNull(this._block, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>"); SpreadBuilder spreadBuilder = new SpreadBuilder(2); spreadBuilder.addSpread(allArgsButLast); spreadBuilder.add(Integer.valueOf(dirty)); Object result = ((FunctionN)this._block).invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()])); if (c.endRestartGroup() != null) { c.endRestartGroup().updateScope(new ComposableLambdaNImpl$invoke$1(realParams, this)); } else { c.endRestartGroup(); }  return result; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}) @SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,193:1\n37#2,2:194\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n*L\n124#1:194,2\n*E\n"}) static final class ComposableLambdaNImpl$invoke$1 extends Lambda implements Function2<Composer, Integer, Unit> { public final void invoke(@NotNull Composer nc, int param1Int) { Intrinsics.checkNotNullParameter(nc, "nc"); Collection $this$toTypedArray$iv = ArraysKt.slice(this.$args, RangesKt.until(0, this.$realParams)); int $i$f$toTypedArray = 0; Collection thisCollection$iv = $this$toTypedArray$iv; Object[] params = thisCollection$iv.toArray(new Object[0]);
/*     */       Intrinsics.checkNotNull(this.$args[this.$realParams + 1], "null cannot be cast to non-null type kotlin.Int");
/*     */       int changed = RecomposeScopeImplKt.updateChangedFlags(((Integer)this.$args[this.$realParams + 1]).intValue());
/*     */       byte b;
/*     */       int i;
/*     */       Object[] arrayOfObject1;
/*     */       for (b = 0, i = this.$args.length - this.$realParams - 2, arrayOfObject1 = new Object[i]; b < i; ) {
/*     */         byte b1 = b;
/*     */         Intrinsics.checkNotNull(this.$args[this.$realParams + 2 + b1], "null cannot be cast to non-null type kotlin.Int");
/*     */         arrayOfObject1[b1] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer)this.$args[this.$realParams + 2 + b1]).intValue()));
/*     */         b++;
/*     */       } 
/*     */       Object[] changedN = arrayOfObject1;
/*     */       SpreadBuilder spreadBuilder = new SpreadBuilder(4);
/*     */       spreadBuilder.addSpread(params);
/*     */       spreadBuilder.add(nc);
/*     */       spreadBuilder.add(Integer.valueOf(changed | 0x1));
/*     */       spreadBuilder.addSpread(changedN);
/*     */       ComposableLambdaNImpl.this.invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()])); }
/*     */ 
/*     */     
/*     */     ComposableLambdaNImpl$invoke$1(int $realParams, ComposableLambdaNImpl $receiver) {
/*     */       super(2);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\ComposableLambdaNImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */