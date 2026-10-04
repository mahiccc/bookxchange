.class final Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;
.super Ljava/lang/Object;
.source "ChatsScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/ui/screens/ChatsScreenKt;->ChatsScreen(Lcom/example/ui/BookViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $book:Lcom/example/data/Book;

.field final synthetic $onChatClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $prefs:Landroid/content/SharedPreferences;

.field final synthetic $readUpdateTrigger$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showNewChatDialog$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/SharedPreferences;Lcom/example/data/Book;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences;",
            "Lcom/example/data/Book;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$prefs:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$book:Lcom/example/data/Book;

    iput-object p3, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$onChatClick:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$showNewChatDialog$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$readUpdateTrigger$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 423
    invoke-virtual {p0}, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->invoke()V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public final invoke()V
    .locals 6

    .line 424
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$showNewChatDialog$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/example/ui/screens/ChatsScreenKt;->access$ChatsScreen$lambda$11(Landroidx/compose/runtime/MutableState;Z)V

    .line 425
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$book:Lcom/example/data/Book;

    invoke-virtual {v1}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "chat_last_read_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x7d0

    add-long/2addr v2, v4

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 426
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$readUpdateTrigger$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/example/ui/screens/ChatsScreenKt;->access$ChatsScreen$lambda$15(Landroidx/compose/runtime/MutableState;J)V

    .line 427
    iget-object v0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$onChatClick:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Lcom/example/ui/screens/ChatsScreenKt$ChatsScreen$8$1$1$1$1$1$1;->$book:Lcom/example/data/Book;

    invoke-virtual {p0}, Lcom/example/data/Book;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
